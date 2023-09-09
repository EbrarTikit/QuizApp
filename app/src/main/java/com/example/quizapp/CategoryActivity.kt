package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quizapp.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.country.setOnClickListener {
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            startActivity(intent)
        }

        binding.sport.setOnClickListener {
            val intent = Intent(this, SportQuestionsActivity::class.java)
            startActivity(intent)
        }

        binding.tech.setOnClickListener {
            val intent = Intent(this, TechQuestionsActivity::class.java)
            startActivity(intent)
        }

        binding.space.setOnClickListener {
            val intent = Intent(this,SpaceQuestionsActivity::class.java)
            startActivity(intent)
        }

    }
}