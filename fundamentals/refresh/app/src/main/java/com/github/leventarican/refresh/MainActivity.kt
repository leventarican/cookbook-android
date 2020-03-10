package com.github.leventarican.refresh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * checkout the associated layout file: android_main.xml
 * we use AppCompatActivity instead of Activity because its supports modern Android features and
 * provides backward compatibility
 */
class MainActivity : AppCompatActivity() {

    // onCreate is the minimum required method of the lifecycle methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bt_page0).setOnClickListener { startActivity(Intent(this, Page0::class.java)) }
        findViewById<Button>(R.id.bt_page1).setOnClickListener { startActivity(Intent(this, Page1::class.java)) }
        findViewById<Button>(R.id.bt_page2).setOnClickListener { startActivity(Intent(this, Page2::class.java)) }
        findViewById<Button>(R.id.bt_page3).setOnClickListener { startActivity(Intent(this, Page3::class.java)) }
        findViewById<Button>(R.id.bt_page4).setOnClickListener { startActivity(Intent(this, Page4::class.java)) }
        findViewById<Button>(R.id.bt_page5).setOnClickListener { startActivity(Intent(this, Page5::class.java)) }
    }

}
