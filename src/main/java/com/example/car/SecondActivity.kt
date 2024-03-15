package com.example.car

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val img_second = findViewById<ImageView>(R.id.img_second)
        val tv_title_second = findViewById<TextView>(R.id.tv_title_secondActivity)
        val tv_ing_second = findViewById<TextView>(R.id.tv_ing_secondActivity)

        val intent = intent

        val image = intent?.getIntExtra("image", 0)
        val title = intent?.getStringExtra("title")
        val description = intent?.getStringExtra("description")

        if (image != null){
            img_second.setImageResource(image)
        }

        tv_title_second.text = title
        tv_ing_second.text = description
    }
}