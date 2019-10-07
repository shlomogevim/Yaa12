package com.example.yaa12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AnimationScreen : AppCompatActivity() {
    companion object {
        const val MANNL = "manl"
        const val GODDL = "godl"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
    }
}
