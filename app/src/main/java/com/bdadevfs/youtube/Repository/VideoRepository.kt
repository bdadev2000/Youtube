package com.bdadevfs.youtube.Repository

import com.bdadevfs.youtube.Api.RetrofitInstance


class VideoRepository {
    //await
    suspend fun getVideo(query: String) = RetrofitInstance.api.getVideo(query)
}