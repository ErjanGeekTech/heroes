package com.example.heroes.ui.acitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.heroes.R
import com.example.heroes.databinding.ActivityMainBinding
import com.example.heroes.singleton.Singleton

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getTextCharacteristic()
    }

    private fun getTextCharacteristic() {
        binding.text.text = Singleton.instance.getHaracter()
    }
}