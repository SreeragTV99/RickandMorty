package com.example.mvvmmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val image:ImageView=findViewById(R.id.characterImage)
        val name:TextView=findViewById(R.id.showName)
        val species:TextView=findViewById(R.id.species)
        val gender:TextView=findViewById(R.id.gender)
        val status:TextView=findViewById(R.id.status)
        val imageView:ImageView=findViewById(R.id.background)
        Glide.with(this).asGif().load(R.drawable.bg3).into(imageView)
        val clickedItem=intent?.getParcelableExtra<Result>("clickedItem")
name.text=clickedItem?.name
        species.text=clickedItem?.species
        gender.text=clickedItem?.gender
        status.text=clickedItem?.status
        if (clickedItem != null) {
            image.setImage(clickedItem.image)
        }





    }
}