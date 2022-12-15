package com.bdadevfs.youtube.Api

import com.bdadevfs.youtube.Model.VideoResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    @Headers("Authorization: 563492ad6f91700001000001f952004d6ddc457f86486dbd3ee7e31e")
    @GET("search")
    suspend fun getVideo(
        @Query("query") query : String = " nature",
        @Query("per_page") perpage : Int = 80
    ) : Response<VideoResponse>
}