package com.androiddevs.mvvmnewsapp.model.response

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "articles")
data class ArticlesItem(
	@PrimaryKey(autoGenerate = true)
	var id: Int? = null,
	val publishedAt: String?,
	val author: String?,
	val urlToImage: String?,
	val description: String?,
	val source: Source?, // ini harus di convert karena Room hanya bisa baca data primitive bukan custom
	val title: String?,
	val url: String?,
	val content: String?
) : Serializable
