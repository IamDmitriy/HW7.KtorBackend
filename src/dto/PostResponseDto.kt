package com.easyapps.dto

import com.easyapps.model.PostModel

class PostResponseDto {
    companion object {
        fun fromModel(model: PostModel) = PostResponseDto()
    }
}
