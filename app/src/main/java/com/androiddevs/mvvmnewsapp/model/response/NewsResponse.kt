package com.androiddevs.mvvmnewsapp.model.response

data class NewsResponse(
	val totalResults: Int,
	val articles: MutableList<ArticlesItem>,
	val status: String
)
