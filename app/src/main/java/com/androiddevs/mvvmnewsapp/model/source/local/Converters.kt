package com.androiddevs.mvvmnewsapp.model.source.local

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.model.response.Source

// Todo = class ini bertugas untuk membantu ROOM melakukan converter data yang ada pada entity menjadi data primitive
class Converters {
    @TypeConverter
    fun fromSource(source: Source): String = source.name

    @TypeConverter
    fun toSource(name:String): Source = Source(name,name)
}