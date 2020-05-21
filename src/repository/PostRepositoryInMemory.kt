package com.easyapps.repository

import com.easyapps.model.PostModel
import com.easyapps.model.PostType
import com.easyapps.ncraftmedia.Location

class PostRepositoryInMemory : PostRepository {
    override suspend fun getAll(): List<PostModel> = generateContent()

    private fun generateContent(): List<PostModel> {
        var maxId: Long = 0

        return listOf(
            PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1588712400000,
                type = PostType.EVENT,
                address = "Варшавское ш., 1, с. 17. Бизнес-центр W Plaza-2",
                sharedByMe = true,
                countShares = 1,
                commentedByMe = true,
                countComments = 1
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1583010000000,
                type = PostType.EVENT,
                location = Location(55.703810, 37.623851)
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "REPOST: First post in our network!",
                created = 1583010000000,
                source = PostModel(
                    id = maxId++,
                    author = "Netology",
                    content = "someContent",
                    created = 1551819600000
                ),
                type = PostType.REPOST
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "REPOST: First post in our network!",
                created = 1583010000000,
                type = PostType.REPOST
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                type = PostType.ADVERTISEMENT,
                link = "https://www.google.com/"
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                videoUrl = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
                type = PostType.VIDEO
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                type = PostType.POST
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1588712400000,
                type = PostType.EVENT,
                address = "Варшавское ш., 1, с. 17. Бизнес-центр W Plaza-2"
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1583010000000,
                type = PostType.EVENT,
                location = Location(55.703810, 37.623851)
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "REPOST: First post in our network!",
                created = 1583010000000,
                source = PostModel(
                    id = maxId++,
                    author = "Netology",
                    content = "someContent",
                    created = 1551819600000
                ),
                type = PostType.REPOST
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                type = PostType.ADVERTISEMENT,
                link = "https://www.google.com/"
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                videoUrl = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
                type = PostType.VIDEO
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                type = PostType.POST
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1588712400000,
                type = PostType.EVENT,
                address = "Варшавское ш., 1, с. 17. Бизнес-центр W Plaza-2"
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1583010000000,
                type = PostType.EVENT,
                location = Location(55.703810, 37.623851)
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "REPOST: First post in our network!",
                created = 1583010000000,
                source = PostModel(
                    id = maxId++,
                    author = "Netology",
                    content = "someContent",
                    created = 1551819600000
                ),
                type = PostType.REPOST
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                type = PostType.ADVERTISEMENT,
                link = "https://www.google.com/"
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                videoUrl = "https://www.youtube.com/watch?v=WhWc3b3KhnY",
                type = PostType.VIDEO
            ), PostModel(
                id = maxId++,
                author = "Netology",
                content = "First post in our network!",
                created = 1520283600000,
                type = PostType.POST
            )
        )
    }
}