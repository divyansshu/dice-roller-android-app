package com.mastercoding.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.diceImg)
        val rollbtn: Button = findViewById(R.id.btn)
        rollbtn.text = "Lets Roll"

        rollbtn.setOnClickListener {
            rollDice();
        }
    }

    private fun rollDice() {

        val randomNum = Random.nextInt(1,6)

        val diceNumber = when(randomNum) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5

            else -> R.drawable.dice6
        }
        diceImage.setImageResource(diceNumber)
    }
}