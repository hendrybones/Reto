package com.example.reto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.reto.adapter.HomeAdapter
import com.example.reto.databinding.ActivityMainBinding
import com.example.reto.repository.Repository
import com.example.reto.viewModel.HomeViewModel
import com.example.reto.viewModel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var binding : ActivityMainBinding? = null

    //initialize viewModel
    private lateinit var viewModel: HomeViewModel
    // initialize adapter
    private val homeAdapter : HomeAdapter?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        // initialize recyclerview
        binding!!.recyclerview.adapter=homeAdapter
        //initialize ViewModel
        val repository = Repository()
        val  viewModelFactory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory) [HomeViewModel :: class.java]

        //implementing observer
        viewModel.movieList.observe(this, Observer {
            Log.d(TAG, "onCreate : $it")
            homeAdapter!!.setMovieList(it)
        })
        viewModel.getAllMovies()



    }
}