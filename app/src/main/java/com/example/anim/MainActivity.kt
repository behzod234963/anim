package com.example.anim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {

        val ivAnimBounce_main:ImageView=findViewById(R.id.ivAnimBounce_main)
        val ivAnimSequential_main:ImageView=findViewById(R.id.ivAnimSequential_main)
        val ivAnimTogather_main:ImageView=findViewById(R.id.ivAnimTogather_main)
        val lavFacebook_main:LottieAnimationView=findViewById(R.id.lavFacebook_main)
        val lavYoutube:LottieAnimationView=findViewById(R.id.lavYoutube)
        val lavTwitter:LottieAnimationView=findViewById(R.id.lavTwitter)

        lavFacebook_main.setOnLongClickListener {

            lavFacebook_main.playAnimation()
            return@setOnLongClickListener true

        }

        lavFacebook_main.setOnClickListener {

            lavFacebook_main.pauseAnimation()

        }

        lavYoutube.setOnLongClickListener {

            lavYoutube.playAnimation()
            return@setOnLongClickListener true

        }

        lavYoutube.setOnClickListener {

            lavYoutube.pauseAnimation()

        }

        lavTwitter.setOnLongClickListener {

            lavTwitter.playAnimation()
            return@setOnLongClickListener true

        }

        lavTwitter.setOnClickListener {

            lavTwitter.pauseAnimation()

        }

        ivAnimBounce_main.setOnLongClickListener {

            val bounce=AnimationUtils.loadAnimation(this,R.anim.anim_bounce)
            ivAnimBounce_main.startAnimation(bounce)
            return@setOnLongClickListener true

        }

        ivAnimSequential_main.setOnLongClickListener {

            val sequential=AnimationUtils.loadAnimation(this,R.anim.anim_sequential)
            ivAnimSequential_main.startAnimation(sequential)
            return@setOnLongClickListener true

        }

        ivAnimTogather_main.setOnLongClickListener {

            val togather=AnimationUtils.loadAnimation(this,R.anim.anim_togather)
            ivAnimTogather_main.startAnimation(togather)
            return@setOnLongClickListener true

        }

    }
}