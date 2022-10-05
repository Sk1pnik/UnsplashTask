package com.skipnik.unsplashtask.data.net

import com.skipnik.unsplashtask.data.net.model.UnsplashPhoto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {


    @Headers("Accept-Version: v1", "Authorization: Client-ID $CLIENT_ID")
    @GET("photos/random")
    suspend fun getPhotos(
        @Query("count") count: Int = 30
    ): List<UnsplashPhoto>

    companion object {
        const val BASE_URL = "https://api.unsplash.com/"
        const val CLIENT_ID = "ab3411e4ac868c2646c0ed488dfd919ef612b04c264f3374c97fff98ed253dc9"
    }
}