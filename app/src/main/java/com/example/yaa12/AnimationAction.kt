package com.example.yaa12

import android.content.res.Resources
import android.graphics.Color
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.github.florent37.viewanimator.ViewAnimator
import kotlinx.android.synthetic.main.activity_animation_screen.view.*


class AnimationAction(val view: View) {
    lateinit var man1: TextView
    lateinit var man2: TextView
    lateinit var man3: TextView
    lateinit var man4: TextView
    lateinit var man5: TextView
    lateinit var man6: TextView
    lateinit var god1: TextView
    lateinit var god1A: TextView
    lateinit var god2: TextView
    lateinit var god3: TextView
    lateinit var god4: TextView
    lateinit var god5: TextView
    lateinit var god6: TextView

    var wi: Float = 0f
    var hi: Float = 0f


    init {
        man1 = view.manSpeaking1
        man2 = view.manSpeaking2
        man3 = view.manSpeaking3
        man4 = view.manSpeaking4
        man5 = view.manSpeaking5
        man6 = view.manSpeaking6
        god1 = view.godSpeaking1
        god1A = view.godSpeaking1A
        god2 = view.godSpeaking2
        god3 = view.godSpeaking3
        god4 = view.godSpeaking4
        god5 = view.godSpeaking5
        god6 = view.godSpeaking6

        wi = Resources.getSystem().displayMetrics.widthPixels.toFloat()
        hi = Resources.getSystem().displayMetrics.heightPixels.toFloat()
    }


    private fun styleMan20(tv: TextView, st: String): TextView {
        var textView = tv;
        textView.text = st
        textView.setBackgroundColor(Color.DKGRAY)
        textView.setTextColor(Color.WHITE)
        textView.setPadding(30, 0, 30, 0)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
        textView.gravity = Gravity.HORIZONTAL_GRAVITY_MASK
        return textView
    }

    fun manTranslation10(arr: List<String>) {
        initAllManTextview()
        val textView10 = styleMan20(man1, arr[0])
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .scale(0f, 1f)
            .duration(2000)
            .start()
    }

    fun manTranslation20(arr: List<String>) {
        initAllManTextview()
        val textView10 = styleMan20(man1, arr[1])
        val textView11 = styleMan20(man2, arr[0])
        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .translationX(wi / 2, 0f)
            .translationY(-hi, 0f)
            .duration(2000)
            .start()
    }

    fun manTranslaion30(arr: List<String>) {
        initAllManTextview()
        val textView10 = styleMan20(man1, arr[2])
        val textView11 = styleMan20(man2, arr[1])
        val textView12 = styleMan20(man3, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun manTranslaion40(arr: List<String>) {
        initAllManTextview()
        val textView10 = styleMan20(man1, arr[3])
        val textView11 = styleMan20(man2, arr[2])
        val textView12 = styleMan20(man3, arr[1])
        val textView13 = styleMan20(man4, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun manTranslaion50(arr: List<String>) {
        initAllManTextview()
        val textView10 = styleMan20(man1, arr[4])
        val textView11 = styleMan20(man2, arr[3])
        val textView12 = styleMan20(man3, arr[2])
        val textView13 = styleMan20(man4, arr[1])
        val textView14 = styleMan20(man5, arr[0])
        var dur = 1000L

        ViewAnimator
            .animate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun styleItGod10(tv: TextView, st: String): TextView {
        var textView = tv
        textView.text = st
        textView.setBackgroundColor(Color.YELLOW)
        textView.setTextColor(Color.parseColor("#bdbdbd"))
        textView.setPadding(20, 0, 20, 0)
        return textView
    }

    fun styleItGod11(tv: TextView, st: String): TextView {
        var textView = tv
        textView.text = st
        textView.setBackgroundColor(Color.CYAN)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12f)
        textView.setTextColor(Color.parseColor("#bdbdbd"))
        textView.setPadding(20, 0, 20, 0)
        return textView
    }

    fun godTranslaion10(arr: List<String>) {
        initAllGogTextview()
        val textView10 = styleItGod10(god1, arr[0])
        val textView20 = styleItGod10(god1A, arr[0])
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .andAnimate(textView20)
            .translationX(wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .duration(2000)
            .start()
    }
    fun godTranslaion11(arr: List<String>) {
        initAllGogTextview()
        val textView10 = styleItGod11(god1, arr[0])
        val textView20 = styleItGod11(god1A, arr[0])
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .andAnimate(textView20)
            .translationX(wi / 2, 0f)
            .translationY(hi, 0f)
            .scale(0f, 2f)
            .duration(2000)
            .start()
    }
    fun godTranslation20(arr: List<String>) {
        initAllGogTextview()
        val textView10 = styleItGod11(god1, arr[0])
        val textView11 = styleItGod11(god2, arr[1])
        ViewAnimator
            .animate(textView10)
            .translationX(-wi / 2, 0f)
            .translationY(-hi, 0f)
            .scale(0f, 1f)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(1)
            .translationX(wi / 2, 0f)
            .translationY(-hi, 0f)
            .duration(2000)
            .start()
    }

    fun godTranslaion30(arr: List<String>) {
        initAllGogTextview()
        val textView10 = styleItGod11(god1, arr[0])
        val textView11 = styleItGod11(god2, arr[1])
        val textView12 = styleItGod11(god3, arr[2])
        var dur = 1000L

        ViewAnimator
            .animate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }

    fun godTranslaion40(arr: List<String>) {
        initAllGogTextview()
        val textView10 = styleItGod11(god1, arr[0])
        val textView11 = styleItGod11(god2, arr[1])
        val textView12 = styleItGod11(god3, arr[2])
        val textView13 = styleItGod11(god4, arr[3])
        var dur = 1000L

        ViewAnimator
            .animate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun godTranslaion50(arr: List<String>) {
        initAllGogTextview()
        val textView10 = styleItGod11(god1, arr[0])
        val textView11 = styleItGod11(god2, arr[1])
        val textView12 = styleItGod11(god3, arr[2])
        val textView13 = styleItGod11(god4, arr[3])
        val textView14 = styleItGod11(god5, arr[4])
        var dur = 1000L

        ViewAnimator
            .animate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(1f, 0f, 1f)
            .duration(dur)
            .start()
    }

    fun godTranslaion60(arr: List<String>) {
        initAllGogTextview()

        val textView10 = styleItGod11(god1, arr[0])
        val textView11 = styleItGod11(god2, arr[1])
        val textView12 = styleItGod11(god3, arr[2])
        val textView13 = styleItGod11(god4, arr[3])
        val textView14 = styleItGod11(god5, arr[4])
        val textView15 = styleItGod11(god6, arr[5])
        var dur = 1000L

        ViewAnimator
            .animate(textView15)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView14)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView13)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView12)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView11)
            .scale(0f, 1f)
            .duration(dur)
            .thenAnimate(textView10)
            .scale(0f, 1f)
            .duration(dur)
            .start()
    }

    fun initAllGogTextview() {
        ViewAnimator
            .animate(god1, god1A, god2, god3, god4, god5, god6)
            .scale(0f)
            .duration(1)
            .start()
    }

    fun initAllManTextview() {
        ViewAnimator
            .animate(man1, man2, man3, man4, man5, man6)
            .scale(0f)
            .duration(1)
            .start()
    }


}