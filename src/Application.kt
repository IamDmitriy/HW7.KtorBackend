package com.easyapps

import com.easyapps.dto.PostResponseDto
import com.easyapps.repository.PostRepository
import com.easyapps.repository.PostRepositoryInMemory
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import org.kodein.di.ktor.KodeinFeature
import org.kodein.di.ktor.kodein

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    val repo by kodein().instance<PostRepository>()

    install(Routing) {
        route("api/v1/posts") {
            get {
                val response = repo.getAll().map(PostResponseDto.Companion::fromModel)
                call.respond(response)
            }
        }
    }

    //Для установки зависимостей
    install(KodeinFeature) {
        bind<PostRepository>() with singleton {
            PostRepositoryInMemory().apply {
                //TODO в примере тут указывают
            }
        }
    }

    //Данный модуль конвертирует обычную мапу в json автоматически. Т.е для ответ
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
            serializeNulls()
        }
    }
}

