package com.bdadevfs.youtube.ViewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bdadevfs.youtube.Repository.VideoRepository

class VideoViewModelFactory(private val videoRepository: VideoRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return com.bdadevfs.youtube.ViewModelFactory.ViewModel(videoRepository) as T
    }
}