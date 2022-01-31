package com.example.reto.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reto.databinding.MovieListBinding
import com.example.reto.model.Movie
import retrofit2.Response

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    var binding : MovieListBinding? =null
    class ViewHolder(val binding: MovieListBinding) :RecyclerView.ViewHolder(binding.root){

    }

    var movies= mutableListOf<Movie>()
    fun setMovieList(movies: List<Movie>){
        this.movies=movies.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MovieListBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
    }

    override fun getItemCount(): Int {
        return movies.size

    }

}