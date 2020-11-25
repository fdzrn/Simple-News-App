package com.androiddevs.mvvmnewsapp.model.source.remote

import com.androiddevs.mvvmnewsapp.BuildConfig
import com.androiddevs.mvvmnewsapp.model.response.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "id",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = BuildConfig.NEWS_API_KEY
    ) : Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        SearchQuery: String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apiKey")
        apiKey: String = BuildConfig.NEWS_API_KEY
    ) : Response<NewsResponse>
}