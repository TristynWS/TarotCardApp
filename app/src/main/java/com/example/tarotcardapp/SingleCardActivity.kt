package com.example.tarotcardapp

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SingleCardActivity : AppCompatActivity() {

    private var isCardFaceUp = true

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

        if (Random.nextBoolean()) { // Randomly decide if the card should be reversed
            cardFront.rotation = 180f // Rotate the card to show it upside down
        } else {
            cardFront.rotation = 0f // Normal orientation
        }

        cardBack.setOnClickListener {
            if (isCardFaceUp) {
                flipCard(cardBack, cardFront)
            } else {
                flipCard(cardFront, cardBack)
            }
            isCardFaceUp = !isCardFaceUp
        }
    }

    private fun flipCard(visibleView: View, invisibleView: View) {
        val animOut = ObjectAnimator.ofFloat(visibleView, "rotationY", 0f, 90f).apply {
            duration = 250 // Half duration of full flip
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    visibleView.visibility = View.GONE
                    invisibleView.visibility = View.VISIBLE
                    invisibleView.rotationY = -90f
                    ObjectAnimator.ofFloat(invisibleView, "rotationY", -90f, 0f).setDuration(250).start()
                }
            })
        }
        animOut.start()
    }
}
