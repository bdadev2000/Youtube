package com.bdadevfs.youtube.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bdadevfs.youtube.Repository.VideoRepository
import com.bdadevfs.youtube.ViewModelFactory.VideoViewModelFactory
import com.bdadevfs.youtube.ViewModelFactory.ViewModel
import com.bdadevfs.youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: ViewModel
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val repository = VideoRepository()
        val viewModelFactory = VideoViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(ViewModel::class.java)
        viewModel.videoList.observe(this, Observer {
            if(it.isSuccessful){
                val  response = it.body()
                if(response!=null){

                }
            }
        })
    }
}