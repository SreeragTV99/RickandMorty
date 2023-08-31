package com.example.mvvmmodel

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(var list:List<Result>):RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
  inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){
      var image:ImageView=view.findViewById(R.id.characterImage)
      var name:TextView=view.findViewById(R.id.showName)
//      var species:TextView=view.findViewById(R.id.species)
//      var gender:TextView=view.findViewById(R.id.gender)
//      var status:TextView=view.findViewById(R.id.status)
      val r2: LinearLayout =view.findViewById(R.id.r2)
      init {
          view.setOnClickListener{
              val clickedItem=list[adapterPosition]
              val intent=Intent(view.context,MainActivity2::class.java)
              intent.putExtra("clickedItem",clickedItem)
              view.context.startActivity(intent)
          }
  }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_layout,parent,false)
        return ViewHolder(layoutView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listData =list[position]
        holder.image.setImage(listData.image)
        holder.name.text=listData.name
//        holder.species.text=listData.species
//        holder.gender.text=listData.gender
//        holder.status.text=listData.status
        holder.r2.setOnClickListener {
            val i=Intent(holder.r2.context,MainActivity2::class.java)
            i.putExtra("clickedItem",listData)
            holder.r2.context.startActivity(i)
        }
    }
    }
