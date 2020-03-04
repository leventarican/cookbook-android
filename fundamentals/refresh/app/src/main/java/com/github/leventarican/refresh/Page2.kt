package com.github.leventarican.refresh

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.github.leventarican.refresh.databinding.ActivityPage2Binding
import com.github.leventarican.refresh.model.ProgrammingLanguage

/**
 * Data-binding demonstration.
 * every time we use findViewById Android system traverses the view hierarchy at runtime to find it
 * data-binding needs to be activated in build.gradle (Module: app) -> dataBinding { enabled = true }
 * also the root element / view group has to wrap with layout element
 */
class Page2 : AppCompatActivity() {

    // databinding.ActivityPage2Binding is build by the compiler and
    // the name is derived from the name of the layout file_ activity_main + Binding
    private lateinit var binding: ActivityPage2Binding

    private val programmingLanguage: ProgrammingLanguage = ProgrammingLanguage("Kotlin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_page2)

        // no findViewById needed
        // button id bt_page2_back becomes btPage2Back
        binding.btPage2Back.setOnClickListener {
            startActivity(Intent(this, Page1::class.java))
        }
        binding.btPage2Next.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.tvPage2BoxOne.setOnClickListener {
            it.setBackgroundResource(R.drawable.ic_launcher_foreground)
        }

        // set layout variable with data class instance
        binding.programmingLanguage = programmingLanguage

        binding.btPage2Apply.setOnClickListener {
            binding.apply {
                programmingLanguage?.name = binding.etPage2Input.text.toString()
                // refresh the UI with the new data
                invalidateAll()
            }

            // hide keyboard
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(it.windowToken, 0)
        }
    }
}
