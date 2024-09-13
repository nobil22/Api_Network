package com.example.api_network

import javax.inject.Inject

class AlbumRepo @Inject constructor(
    val apiService: ApiService
) {
    suspend fun getAlbumList():List<Album>{
        return apiService.grtAlbumList()
    }
}