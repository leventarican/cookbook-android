package com.github.leventarican.refresh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        findViewById<Button>(R.id.bt_page1_back).setOnClickListener {
            startActivity(Intent(this, Page0::class.java))
        }
        findViewById<Button>(R.id.bt_page1_next).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
