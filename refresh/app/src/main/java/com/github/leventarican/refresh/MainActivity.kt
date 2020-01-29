package com.github.leventarican.refresh

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var dice_0: ImageView
    lateinit var dice_1: ImageView
    lateinit var rollButton: Button
//    var rollButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice_0 = findViewById(R.id.img_first_dice)
        dice_1 = findViewById(R.id.img_second_dice)
        rollButton = findViewById(R.id.bt_roll)

        rollButton.setOnClickListener {
            roll()
        }

    }

    private fun roll(): Unit {
        var randomDice = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_0.setImageResource(randomDice)

        randomDice = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_1.setImageResource(randomDice)
    }
}
