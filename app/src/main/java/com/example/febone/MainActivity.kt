package com.example.febone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvBtn: TextView = findViewById(R.id.tvBtn)
        tvBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, DoubleScreen::class.java)
            startActivity(intent)
            this@MainActivity.finish()
        }
    }
}