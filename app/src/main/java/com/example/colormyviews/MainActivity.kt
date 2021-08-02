package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isGone

lateinit var box1 :TextView;
lateinit var box2 :TextView;
lateinit var box3 :TextView;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        box1=findViewById(R.id.box_three_text)
        box2=findViewById(R.id.box_four_text)
        box3=findViewById(R.id.box_five_text)
        setListeners()
    }

    private fun setListeners()
    {
        val clickableViews: List<View> =
                listOf(
                       findViewById(R.id.box_one_text),
                        findViewById(R.id.box_two_text),
                        findViewById(R.id.box_three_text),
                        findViewById(R.id.box_four_text),
                        findViewById(R.id.box_five_text),
                        findViewById(R.id.constraint_layout),
                        findViewById(R.id.green_button),
                        findViewById(R.id.red_button),
                        findViewById(R.id.yellow_button)
                )

        for(item in clickableViews )
        {
            item.setOnClickListener{makeColored(it)}
        }
    }
    fun makeColored(view: View) {

        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
          //  R.id.red_buttonbox1.visibility=false
            R.id.red_button -> box1.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box2.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box3.setBackgroundResource(R.color.my_green)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}