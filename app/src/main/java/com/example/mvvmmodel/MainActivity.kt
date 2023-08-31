package com.example.mvvmmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var viewmodel:ItemViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView =findViewById(R.id.background)
        Glide.with(this).asGif().load(R.drawable.bg3).into(imageView)

        viewmodel=ViewModelProvider(this).get(ItemViewModel::class.java)
        var r1=findViewById<RecyclerView>(R.id.r1)
        val layoutManager=LinearLayoutManager(this)
        r1.layoutManager=layoutManager
        viewmodel.getData()
        viewmodel.response.observe(this){
            result->
            var adapter=ItemAdapter(result)
            r1.adapter=adapter
        }


    }
}