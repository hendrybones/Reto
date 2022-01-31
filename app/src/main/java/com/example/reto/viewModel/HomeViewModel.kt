package com.example.reto.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.reto.model.Movie
import com.example.reto.repository.Repository
import retrofit2.Response

class HomeViewModel( private var repository : Repository) : ViewModel() {

    val movieList = MutableLiveData<List<Movie>>()

    fun getAllMovies(){
        val response =repository.getAllMovies()
        movieList.value = listOf()
        Log.d(" reponseVM", response.toString())
    }
}