package com.giahai.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class RandomXuActivity : AppCompatActivity() {
    lateinit var imgXu : ImageView
    lateinit var imgResett : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_xu)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        imgXu = findViewById(R.id.imgXU)
        imgResett = findViewById(R.id.imgResett)
        imgResett.setOnClickListener {
            imgXu.setImageResource(R.drawable.empty_dice)
        }

    }
    private fun rollDice() {
        imgXu.setImageResource(getRandomDiceImage())
    }
    private fun getRandomDiceImage() : Int {
        val randomInt = Random().nextInt(2)+1
        return when (randomInt) {
            1 -> R.drawable.truoc
            else -> R.drawable.sau
        }
    }
}