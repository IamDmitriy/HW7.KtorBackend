import com.easyapps.module
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.http.withCharset
import io.ktor.server.testing.contentType
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication

import org.junit.Test

import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun testGetAll() {
        withTestApplication({ module() }) {
            with(handleRequest(HttpMethod.Get, "api/v1/posts")) {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals(
                    ContentType.Application.Json.withCharset(Charsets.UTF_8),
                    response.contentType()
                )
            }
        }
    }
}