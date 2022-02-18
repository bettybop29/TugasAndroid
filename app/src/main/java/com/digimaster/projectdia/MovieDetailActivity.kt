package com.digimaster.projectdia

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.digimaster.projectdia.databinding.ActivityMovieDetailBinding

class MovieDetailActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_movie_detail)
        var movieId = intent.getIntExtra("movieId", 0)
        Log.d("succes", movieId.toString())
    }
}