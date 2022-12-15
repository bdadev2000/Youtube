package com.bdadevfs.youtube.ViewModelFactory

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bdadevfs.youtube.Model.VideoResponse
import com.bdadevfs.youtube.Repository.VideoRepository
import kotlinx.coroutines.launch
import retrofit2.Response

class ViewModel(val repository: VideoRepository) : ViewModel(){
    lateinit var videoList : MutableLiveData<Response<VideoResponse>>

    init {
        videoList = MutableLiveData()
        getVideo("nature")
    }

    fun getVideo(s : String){
        viewModelScope.launch {
            //await
            val response = repository.getVideo(s)
            videoList.postValue(response)

        }
    }

}