package com.github.leventarican.refresh

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Page0 : AppCompatActivity() {

    lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page0)

        backButton = findViewById(R.id.bt_back)

        // programmatically way to handle a button click at runtime.
        backButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        findViewById<TextView>(R.id.bt_next).setOnClickListener {
            startActivity(Intent(this, Page1::class.java))
        }
        findViewById<TextView>(R.id.progLang_text).setOnClickListener {
            textViewHandler(it)
        }
    }

    /**
     * alternative way to handle a button click. we register this function in xml.
     */
    fun buttonApplyHandler(button: View) {
        val progLangEditText = findViewById<EditText>(R.id.progLang_edit)
        val progLangTextView = findViewById<TextView>(R.id.progLang_text)

        progLangTextView?.text = progLangEditText.text
        progLangTextView?.visibility = View.VISIBLE

        // hide keyboard
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(button.windowToken, 0)

        Log.d(Page0::class.java.simpleName, "apply button clicked: ${progLangTextView.text}; ${progLangTextView.visibility}; ${(button as Button).text}")
    }

    fun textViewHandler(textView: View) {
        val progLangEditText = findViewById<EditText>(R.id.progLang_edit)
        val applyButton = findViewById<Button>(R.id.bt_apply)

        progLangEditText.visibility = View.VISIBLE
        applyButton.visibility = View.VISIBLE
        textView.visibility = View.GONE

        // set focus to EditText
        progLangEditText.requestFocus()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(progLangEditText, 0)

        Log.d(Page0::class.java.simpleName, "${progLangEditText.visibility}; ${applyButton.visibility}; ${textView.visibility}")
    }
}
