package com.bdadevfs.youtube.Api

import com.bdadevfs.youtube.Utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


class RetrofitInstance {
    companion object {
        /**Lazy: retrofit sẽ không được khởi tạo trừ khi biết này được sử dụng lần đầu tiên.*/
        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy{
            retrofit.create(ApiInterface::class.java)
        }
    }
}