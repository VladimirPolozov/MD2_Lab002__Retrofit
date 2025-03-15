package com.example.md2_lab002__retrofit.model.network

import retrofit2.http.GET
import com.example.md2_lab002__retrofit.model.CharacterResponse
import retrofit2.http.Query

interface RickAndMortyApiService {
    @GET("character")
    suspend fun getCharacters(
        @Query("page") pageNumber: Int
    ): CharacterResponse
}