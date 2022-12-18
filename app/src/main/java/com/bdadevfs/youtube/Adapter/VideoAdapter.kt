package com.bdadevfs.youtube.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bdadevfs.youtube.Model.VideoResponse
import com.bdadevfs.youtube.databinding.ItemVideoBinding
import com.bumptech.glide.Glide

class VideoAdapter : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>(){

    var list = ArrayList<VideoResponse.Video>()
    lateinit var context: Context
    fun setVideoData(list: ArrayList<VideoResponse.Video>,context: Context){
        this.list = list
        this.context =  context
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        return VideoViewHolder(ItemVideoBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
      Glide.with(holder.itemView).load(list[position].image).into(holder.binding.imageView)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    class  VideoViewHolder(val binding: ItemVideoBinding) : RecyclerView.ViewHolder(binding.root)

}