package com.example.tarotcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarotcardapp.ui.theme.TarotCardAppTheme
import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
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

class SingleCardActivity {

}

class LearnActivity {

}
