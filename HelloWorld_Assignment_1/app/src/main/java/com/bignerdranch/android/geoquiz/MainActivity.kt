package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var clickMeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickMeButton = findViewById(R.id.click_me_button)

        clickMeButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                "Hello World!",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}