package com.bdadevfs.youtube.Model

data class VideoResponse(
    val page: Int,
    val per_page: Int,
    val total_results: Int,
    val url: String,
    val videos: List<Video>
) {
    data class Video(
        val duration: Int,
        val height: Int,
        val id: Int,
        val image: String,
        val url: String,
        val user: User,
        val video_files: List<VideoFile>,
        val video_pictures: List<VideoPicture>,
        val width: Int
    ) {
        data class User(
            val id: Int,
            val name: String,
            val url: String
        )

        data class VideoFile(
            val file_type: String,
            val height: Int,
            val id: Int,
            val link: String,
            val quality: String,
            val width: Int
        )

        data class VideoPicture(
            val id: Int,
            val nr: Int,
            val picture: String
        )
    }
}