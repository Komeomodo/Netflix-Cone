package com.example.netflixclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.netflixclone.databinding.ActivityMainBinding
import com.utsman.recycling.setupAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val l = arrayListOf<String>("He", "she")

        binding.rvMoviesLargeCard.setupAdapter<String>(R.layout.large_movie_card) { adapter, context, list ->
            // recycling your holder
            bind { itemView, position, item ->
                // bind view


                itemView.setOnClickListener {  }

                }

            setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false))
            submitList(l)
        }
    }
}