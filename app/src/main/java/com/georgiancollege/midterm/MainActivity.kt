package com.georgiancollege.midterm

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.georgiancollege.midterm.databinding.ActivityMainBinding

/*
 * File: Midterm
 * Author: Nicolas B. Millan
 * StudentID: 200533728
 * Date: June 18, 2024
 * Description: This file contains a functional Calculator .
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var userName: String = ""
    private var userAge: Int = 0
    private var userHeight: Int = 0
    private var userWeight: Int = 0
    private var userMeasurement: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        userName = binding.fullName.toString()

    }
}