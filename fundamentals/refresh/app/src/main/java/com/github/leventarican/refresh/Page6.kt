package com.github.leventarican.refresh

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.LinearInterpolator
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_page6.*

/**
 * interpolation
 */
class Page6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val factorDPtoPX = resources.displayMetrics.density
        val animate = findViewById<ImageView>(R.id.iv_animate)

        val va = ValueAnimator.ofFloat(0.0f, 100 * factorDPtoPX)
//        va.interpolator = LinearInterpolator()
        va.interpolator = BounceInterpolator()
        va.duration = 2000L
        va.repeatMode = ObjectAnimator.REVERSE
        va.repeatCount = 3
        va.addUpdateListener { animation ->
            iv_animate.translationY = animation.animatedValue as Float
        }
        button.setOnClickListener{
            if(!va.isStarted)
                va.start()
        }
    }
}
