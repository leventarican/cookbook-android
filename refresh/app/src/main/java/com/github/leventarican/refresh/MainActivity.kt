package com.github.leventarican.refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultText: TextView = findViewById(R.id.tv_result)
        val rollButton: Button = findViewById(R.id.bt_roll)

        rollButton.setOnClickListener {
            roll()
            resultText.text = "rolled: ${(1..6).random()}"
        }


    }

    private fun roll(): Unit {
        Toast.makeText(this, "button roll clicked", Toast.LENGTH_LONG).show()
    }
}
