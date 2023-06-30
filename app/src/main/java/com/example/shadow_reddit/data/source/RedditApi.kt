package com.example.shadow_reddit.data.source

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface RedditApi {
    @GET("/r/popular.json")
    suspend fun getPopularPosts(): ResponseBody
}