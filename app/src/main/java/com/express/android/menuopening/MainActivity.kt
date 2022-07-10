package com.express.android.menuopening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.express.android.menuopening.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val _binding: ActivityMainBinding get() = binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.targetPrice.setOnClickListener {
            getSupportFragmentManager().beginTransaction()
        }
    }
}