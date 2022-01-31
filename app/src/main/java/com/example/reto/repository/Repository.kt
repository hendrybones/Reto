package com.example.reto.repository

import android.util.Log
import com.example.reto.model.Movie
import com.example.reto.network.RetroInstance
import retrofit2.Response

class Repository {

    fun getAllMovies(): Response<Movie>{
        Log.d("responseRepo",RetroInstance.api.getAllMovies().toString())
        return RetroInstance.api.getAllMovies()
    }
}