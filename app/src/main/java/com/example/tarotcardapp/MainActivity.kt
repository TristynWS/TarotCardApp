package com.example.tarotcardapp

import android.os.Bundle
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tarotcardapp.SingleCardActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Method for Learn button click
    fun onLearnClicked(view: View) {
        val intent = Intent(this, LearnActivity::class.java)
        startActivity(intent)
    }
    // Method for Single Card Reading button click
    fun onSingleCardClicked(view: View) {
        val intent = Intent(this, SingleCardActivity::class.java)
        startActivity(intent)
    }
}
class LearnActivity {
}