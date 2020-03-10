package com.github.leventarican.refresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

/**
 * animation
 */
class Page5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        val factorDPtoPX = resources.displayMetrics.density
        val animate = findViewById<ImageView>(R.id.iv_animate)

        findViewById<Button>(R.id.bt_tx_plus).setOnClickListener {
            animate.translationX += 50 * factorDPtoPX
        }
        findViewById<Button>(R.id.bt_tx_minus).setOnClickListener {
            animate.translationX -= 50 * factorDPtoPX
        }
        findViewById<Button>(R.id.bt_ty_plus).setOnClickListener {
            animate.translationY += 50 * factorDPtoPX
        }
        findViewById<Button>(R.id.bt_ty_minus).setOnClickListener {
            animate.translationY -= 50 * factorDPtoPX
        }
        findViewById<Button>(R.id.bt_tz_plus).setOnClickListener {
            animate.translationZ += 50 * factorDPtoPX
        }
        findViewById<Button>(R.id.bt_tz_minus).setOnClickListener {
            animate.translationZ -= 50 * factorDPtoPX
        }

        findViewById<Button>(R.id.bt_sx_plus).setOnClickListener {
            animate.scaleX += 0.1f
        }
        findViewById<Button>(R.id.bt_sx_minus).setOnClickListener {
            animate.scaleX -= 0.1f
        }
        findViewById<Button>(R.id.bt_sy_plus).setOnClickListener {
            animate.scaleY += 0.1f
        }
        findViewById<Button>(R.id.bt_sy_minus).setOnClickListener {
            animate.scaleY -= 0.1f
        }

        findViewById<Button>(R.id.bt_rx_plus).setOnClickListener {
            animate.rotationX += 20.0f
        }
        findViewById<Button>(R.id.bt_rx_minus).setOnClickListener {
            animate.rotationX -= 20.0f
        }
        findViewById<Button>(R.id.bt_ry_plus).setOnClickListener {
            animate.rotationY += 20.0f
        }
        findViewById<Button>(R.id.bt_ry_minus).setOnClickListener {
            animate.rotationY -= 20.0f
        }
        findViewById<Button>(R.id.bt_rz_plus).setOnClickListener {
            animate.rotation += 20.0f
        }
        findViewById<Button>(R.id.bt_rz_minus).setOnClickListener {
            animate.rotation -= 20.0f
        }
    }
}
