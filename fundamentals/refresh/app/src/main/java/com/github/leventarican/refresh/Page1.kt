package com.github.leventarican.refresh

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        findViewById<Button>(R.id.bt_page1_back).setOnClickListener {
            startActivity(Intent(this, Page0::class.java))
        }
        findViewById<Button>(R.id.bt_page1_next).setOnClickListener {
            startActivity(Intent(this, Page2::class.java))
        }

        setListeners()
    }

    private fun setListeners() {
        val boxOneText = findViewById<TextView>(R.id.tv_box_one)
        val boxTwoText = findViewById<TextView>(R.id.tv_box_two)
        val boxThreeText = findViewById<TextView>(R.id.tv_chain_box_three)
        val boxFourText = findViewById<TextView>(R.id.tv_chain_box_four)
        val boxFiveText = findViewById<TextView>(R.id.tv_chain_box_five)

        val rootConstraintLayout = findViewById<View>(R.id.root_constraint_layout)

        val clickableViews: List<View> = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout)
        for (item in clickableViews) {
            item.setOnClickListener { changeColor(it) }
        }
    }

    private fun changeColor(view: View) {
        when (view.id) {
            R.id.tv_box_one -> view.setBackgroundColor(Color.BLUE)
            R.id.tv_box_two -> view.setBackgroundResource(R.drawable.ic_launcher_foreground)
            R.id.tv_chain_box_three -> view.setBackgroundColor(Color.GREEN)
            R.id.tv_chain_box_four -> view.setBackgroundColor(Color.BLACK)
            R.id.tv_chain_box_five -> view.setBackgroundColor(Color.RED)

            // e.g. for the case when user taps background
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
