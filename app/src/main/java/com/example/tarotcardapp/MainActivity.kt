package com.example.tarotcardapp

import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button // Import statement for Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Correctly initialize the button and set its click listener
        val btnSingleCardReading: Button = findViewById(R.id.btnSingleCardReading)
        btnSingleCardReading.setOnClickListener {
            onSingleCardClicked()
        }
    }

    private fun onSingleCardClicked() {
        // Intent to start SingleCardActivity
        val intent = Intent(this, SingleCardActivity::class.java)
        startActivity(intent)
    }
}
