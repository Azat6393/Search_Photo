package com.azatberdimyradov.imagesearchapp.api

import com.azatberdimyradov.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)