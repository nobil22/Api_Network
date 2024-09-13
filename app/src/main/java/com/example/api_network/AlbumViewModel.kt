package com.example.api_network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class AlbumViewModel@Inject constructor(
    private val albumRepo: AlbumRepo

) :ViewModel(){
    init {
        fetchAlbum()
    }
    private val _albumList=MutableLiveData<List<Album>>()
    val album:LiveData<List<Album>> = _albumList

     fun fetchAlbum() {
      viewModelScope.launch {
          val response=albumRepo.getAlbumList()
          _albumList.postValue(response)
      }
    }
}