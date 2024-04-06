package com.example.tarotcardapp // Adjusted package to match the manifest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.view.View

class SingleCardActivity : AppCompatActivity() {

    // List of links for 22 major arcana cards
    private val cards = listOf(
        R.drawable.fool0, R.drawable.magician1, R.drawable.priestess2,
        R.drawable.empress3, R.drawable.emperor4, R.drawable.hierophant5,
        R.drawable.lovers6, R.drawable.chariot7, R.drawable.strength8,
        R.drawable.hermit9, R.drawable.fortune10, R.drawable.justice11,
        R.drawable.hanged12, R.drawable.death13, R.drawable.temperance14,
        R.drawable.devil15, R.drawable.tower16, R.drawable.star17,
        R.drawable.moon18, R.drawable.sun19, R.drawable.judgement20,
        R.drawable.world21
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_card)

        val cardBack: ImageView = findViewById(R.id.cardBack)
        val cardFront: ImageView = findViewById(R.id.cardFront)

        // Initially, a random card is chosen but not shown (front image is invisible)
        val randomCardDrawable = cards.random()
        cardFront.setImageResource(randomCardDrawable)

        cardBack.setOnClickListener {
            // Placeholder for your card flip logic
            cardBack.visibility = View.GONE
            cardFront.visibility = View.VISIBLE
        }
    }
}
