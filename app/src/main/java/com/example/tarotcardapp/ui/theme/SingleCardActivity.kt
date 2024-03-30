package com.example.tarotcardapp.ui.theme

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import com.example.tarotcardapp.R

class SingleCardActivity() : AppCompatActivity(), Parcelable {

    // List links for 22 major arcana cards
    private val cards = listOf(
        R.drawable.fool0, R.drawable.magician1, R.drawable.priestess2,
        R.drawable.empress3, R.drawable.emperor4, R.drawable.hierophant5,
        R.drawable.lovers6, R.drawable.chariot7, R.drawable.strength8,
        R.drawable.hermit9, R.drawable.fortune10, R.drawable.justice11,
        R.drawable.hanged12, R.drawable.death13, R.drawable.temperance14,
        R.drawable.devil15, R.drawable.tower16, R.drawable.star17,
        R.drawable.moon18, R.drawable.sun19, R.drawable.judgement20,
        R.drawable.world21,
        )

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_card)

        val imageView: ImageView = findViewById(R.id.cardImageView) // Make sure this ID matches your layout
        val randomCardIndex = cards.random() // Randomly select a card
        imageView.setImageResource(randomCardIndex) // Set the image resource to the randomly selected card
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SingleCardActivity> {
        override fun createFromParcel(parcel: Parcel): SingleCardActivity {
            return SingleCardActivity(parcel)
        }

        override fun newArray(size: Int): Array<SingleCardActivity?> {
            return arrayOfNulls(size)
        }
    }

}
