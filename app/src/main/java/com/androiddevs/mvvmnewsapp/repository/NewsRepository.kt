package com.androiddevs.mvvmnewsapp.repository

import com.androiddevs.mvvmnewsapp.model.response.ArticlesItem
import com.androiddevs.mvvmnewsapp.model.source.local.ArticleDatabase
import com.androiddevs.mvvmnewsapp.model.source.remote.RetrofitInstance

class NewsRepository(val database: ArticleDatabase) {
    // Remote
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun getSearchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    // Local
    suspend fun updateOrInsert(article: ArticlesItem) =
        database.getArticleDao().updateOrInsert(article)

    fun getSavedNews() = database.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: ArticlesItem) =
        database.getArticleDao().deleteArticle(article)
}