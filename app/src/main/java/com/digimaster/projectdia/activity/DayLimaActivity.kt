package com.digimaster.projectdia.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.digimaster.projectdia.databinding.ActivityDayLimaBinding
import com.digimaster.projectdia.viewmodel.DayLimaViewModel

class DayLimaActivity : AppCompatActivity() {
    lateinit var binding: ActivityDayLimaBinding
    private val viewModel: DayLimaViewModel by lazy {
        ViewModelProviders.of(this).get(DayLimaViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDayLimaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val layoutManager = LinearLayoutManager(this)
        binding.rvHasil.layoutManager = layoutManager
        viewModel.getAllJob()
        setObserver()
    }
}
