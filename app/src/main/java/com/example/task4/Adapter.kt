package com.example.task4

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(var data: ArrayList<Chat>, var recyclerView: RecyclerView): RecyclerView.Adapter<Adapter.ViewHolder>() {
    
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name)
        val unreadMesCount: TextView = view.findViewById(R.id.count)
        val lastMes: TextView = view.findViewById(R.id.last_mes)
        val image: ImageView = view.findViewById(R.id.image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.name.text = data[position].name
        holder.unreadMesCount.text = data[position].unreadMesCount
        holder.lastMes.text = data[position].lastMes
        holder.image.setImageResource(data[position].image)
    }

    override fun getItemCount(): Int = data.size

}
