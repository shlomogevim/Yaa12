package com.example.yaa12

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animation_screen.*


class AnimationScreen : AppCompatActivity() {
    companion object {
        const val MANNL = "manl"
        const val GODDL = "godl"
    }

    lateinit var godList: ArrayList<String>
    lateinit var manList: ArrayList<String>
    var manMode = true
    var sevev = 0
    var counterSituation=0

    // var animationInAction = AnimationAction(mainLayout)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
        manList = intent.getStringArrayListExtra(MANNL)
        godList = intent.getStringArrayListExtra(GODDL)
        generalOperation()
        goddy.setOnClickListener {
            if (!manMode) {
                generalOperation()
                manMode = true
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האדם לדבר", Toast.LENGTH_LONG).show()
            }
        }

        man.setOnClickListener {
            //operateMan(manList[round])
            if (manMode) {
                generalOperation()
                manMode = false
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האין סוף להגיב", Toast.LENGTH_LONG).show()

            }

        }

    }

    private fun generalOperation() {

      //  manMode = false
       // sevev = 6

        counterSituation++
        update_title_situation()

        var speaking = ""
        if (manMode) {
            //Its man position
            speaking = manList[sevev]
            operateMan(speaking)
            manMode = false
        } else {
            // lts God position
            speaking = godList[sevev]
            operateGoddy(speaking)
            manMode = true
            sevev++

        }

    }

    fun update_title_situation() {
        title_situation.text = "madMode=$manMode round=$sevev"
        counter_situation.text="counter=$counterSituation"
    }

    private fun operateGoddy(st: String) {
        val arr = st.split("\n")
        var size = arr.size
        var animationInAction = AnimationAction(mainLayout)
        initGod(size)
        when (size) {
            /*1 -> {
                if (sevev == 6) {
                    animationInAction.godTranslaion11(arr,counterSituation)
                } else {
                    animationInAction.godTranslaion10(arr,counterSituation)
                }
            }*/
            1 ->animationInAction.godTranslaion11(arr,counterSituation)
            2 -> animationInAction.godTranslation20(arr,counterSituation)
            3 -> animationInAction.godTranslaion30(arr,counterSituation)
            4 -> animationInAction.godTranslaion40(arr,counterSituation)
            5 -> animationInAction.godTranslaion50(arr,counterSituation)
            6 -> animationInAction.godTranslaion60(arr,counterSituation)
        }
    }

    private fun initGod(ind: Int) {
        godSpeaking1.visibility = View.GONE
        godSpeaking2.visibility = View.GONE
        godSpeaking3.visibility = View.GONE
        godSpeaking4.visibility = View.GONE
        godSpeaking5.visibility = View.GONE
        godSpeaking6.visibility = View.GONE

        when (ind) {
            1 -> godSpeaking1.visibility = View.VISIBLE
            2 -> {
                godSpeaking1.visibility = View.VISIBLE
                godSpeaking2.visibility = View.VISIBLE
            }
            3 -> {
                godSpeaking1.visibility = View.VISIBLE
                godSpeaking2.visibility = View.VISIBLE
                godSpeaking3.visibility = View.VISIBLE
            }
            4 -> {
                godSpeaking1.visibility = View.VISIBLE
                godSpeaking2.visibility = View.VISIBLE
                godSpeaking3.visibility = View.VISIBLE
                godSpeaking4.visibility = View.VISIBLE
            }
            5 -> {
                godSpeaking1.visibility = View.VISIBLE
                godSpeaking2.visibility = View.VISIBLE
                godSpeaking3.visibility = View.VISIBLE
                godSpeaking4.visibility = View.VISIBLE
                godSpeaking5.visibility = View.VISIBLE
            }
            5 -> {
                godSpeaking1.visibility = View.VISIBLE
                godSpeaking2.visibility = View.VISIBLE
                godSpeaking3.visibility = View.VISIBLE
                godSpeaking4.visibility = View.VISIBLE
                godSpeaking5.visibility = View.VISIBLE
                godSpeaking6.visibility = View.VISIBLE
            }
        }

    }

    private fun operateMan(st: String) {
        val arr = st.split("\n")
        var size = arr.size
        var animationInAction = AnimationAction(mainLayout)
        initMan(size)
        when (size) {
            1 -> animationInAction.manTranslation10(arr,counterSituation)
            2 -> animationInAction.manTranslation20(arr,counterSituation)
            3 -> animationInAction.manTranslaion30(arr,counterSituation)
            4 -> animationInAction.manTranslaion40(arr,counterSituation)
            5 -> animationInAction.manTranslaion50(arr,counterSituation)
        }
    }

    private fun initMan(ind: Int) {
        manSpeaking1.visibility = View.GONE
        manSpeaking2.visibility = View.GONE
        manSpeaking3.visibility = View.GONE
        manSpeaking4.visibility = View.GONE
        manSpeaking5.visibility = View.GONE
        manSpeaking6.visibility = View.GONE

        when (ind) {
            1 -> manSpeaking1.visibility = View.VISIBLE
            2 -> {
                manSpeaking1.visibility = View.VISIBLE
                manSpeaking2.visibility = View.VISIBLE
            }
            3 -> {
                manSpeaking1.visibility = View.VISIBLE
                manSpeaking2.visibility = View.VISIBLE
                manSpeaking3.visibility = View.VISIBLE
            }
            4 -> {
                manSpeaking1.visibility = View.VISIBLE
                manSpeaking2.visibility = View.VISIBLE
                manSpeaking3.visibility = View.VISIBLE
                manSpeaking4.visibility = View.VISIBLE
            }
            5 -> {
                manSpeaking1.visibility = View.VISIBLE
                manSpeaking2.visibility = View.VISIBLE
                manSpeaking3.visibility = View.VISIBLE
                manSpeaking4.visibility = View.VISIBLE
                manSpeaking5.visibility = View.VISIBLE
            }
            5 -> {
                manSpeaking1.visibility = View.VISIBLE
                manSpeaking2.visibility = View.VISIBLE
                manSpeaking3.visibility = View.VISIBLE
                manSpeaking4.visibility = View.VISIBLE
                manSpeaking5.visibility = View.VISIBLE
                manSpeaking6.visibility = View.VISIBLE
            }
        }

    }

}


/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_screen)
        animationUti = AnimationUti()



        goddy.setOnClickListener {
            if (!manMode) {
                generalOperation()
                manMode = true
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האדם לדבר", Toast.LENGTH_LONG).show()
            }
        }

        man.setOnClickListener {
            //operateMan(manList[round])
            if (manMode) {
                generalOperation()
                manMode = false
            } else {
                Toast.makeText(this, "נסה שוב, זה התור של האין סוף להגיב", Toast.LENGTH_LONG).show()

            }

        }
    }



    private fun initGod(ind:Int){
        godSpeaking1.visibility=View.GONE
        godSpeaking2.visibility=View.GONE
        godSpeaking3.visibility=View.GONE
        godSpeaking4.visibility=View.GONE
        godSpeaking5.visibility=View.GONE
        godSpeaking6.visibility=View.GONE

        when (ind){
            1->godSpeaking1.visibility=View.VISIBLE
            2->{
                godSpeaking1.visibility=View.VISIBLE
                godSpeaking2.visibility=View.VISIBLE
            }
            3->{
                godSpeaking1.visibility=View.VISIBLE
                godSpeaking2.visibility=View.VISIBLE
                godSpeaking3.visibility=View.VISIBLE
            }
            4->{
                godSpeaking1.visibility=View.VISIBLE
                godSpeaking2.visibility=View.VISIBLE
                godSpeaking3.visibility=View.VISIBLE
                godSpeaking4.visibility=View.VISIBLE
            }
            5->{
                godSpeaking1.visibility=View.VISIBLE
                godSpeaking2.visibility=View.VISIBLE
                godSpeaking3.visibility=View.VISIBLE
                godSpeaking4.visibility=View.VISIBLE
                godSpeaking5.visibility=View.VISIBLE
            }
            5->{
                godSpeaking1.visibility=View.VISIBLE
                godSpeaking2.visibility=View.VISIBLE
                godSpeaking3.visibility=View.VISIBLE
                godSpeaking4.visibility=View.VISIBLE
                godSpeaking5.visibility=View.VISIBLE
                godSpeaking6.visibility=View.VISIBLE
            }
        }

    }


    private fun operateGoddy(st: String) {
        var arr = st.split("\n")

        var size=arr.size
        initGod(size)
        when (size) {

            1 -> animationUti.godTranslaion10(arr, godSpeaking1, godSpeaking1A)

            2 -> animationUti.godTranslation20(arr, godSpeaking1, godSpeaking2)

            3 -> animationUti.godTranslaion30(arr, godSpeaking1, godSpeaking2, godSpeaking3)

            4 -> animationUti.godTranslaion40(
                arr,
                godSpeaking1,
                godSpeaking2,
                godSpeaking3,
                godSpeaking4
            )

            5 -> animationUti.godTranslaion50(
                arr,
                godSpeaking1,
                godSpeaking2,
                godSpeaking3,
                godSpeaking4,
                godSpeaking5
            )
            6 -> animationUti.godTranslaion60(
                arr,
                godSpeaking1,
                godSpeaking2,
                godSpeaking3,
                godSpeaking4,
                godSpeaking5,
                godSpeaking6
            )


        }
    }





}*/

