package com.androiddevs.mvvmnewsapp.model.source.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.androiddevs.mvvmnewsapp.model.response.ArticlesItem

@Dao
interface ArticleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateOrInsert(article: ArticlesItem): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<ArticlesItem>>

    @Delete
    suspend fun deleteArticle(article: ArticlesItem)
}