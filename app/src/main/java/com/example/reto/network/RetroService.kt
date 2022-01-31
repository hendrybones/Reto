package com.example.reto.network

import android.telecom.Call
import com.example.reto.model.Movie
import retrofit2.Response
import retrofit2.http.GET

interface RetroService {
    @GET("movielist.json")
    fun getAllMovies() : Response<Movie>
}