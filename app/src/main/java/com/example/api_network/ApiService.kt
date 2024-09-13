package com.example.api_network

import retrofit2.http.GET

interface ApiService {

    @GET("albums")
    suspend fun grtAlbumList():List<Album>
}