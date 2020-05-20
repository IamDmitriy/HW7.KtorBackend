package com.easyapps.repository

import com.easyapps.model.PostModel

interface PostRepository {
    suspend fun getAll(): List<PostModel>
}