package com.example.a13recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val garderob: MutableList<Garderob>) :
    RecyclerView.Adapter<MyAdapter.GarderobViewHolder>() {
    class GarderobViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTV: TextView = itemView.findViewById(R.id.nameTV)
        val descriptionTV: TextView = itemView.findViewById(R.id.descriptionTV)
        val imageIV: ImageView = itemView.findViewById(R.id.imageClothesIV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GarderobViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return GarderobViewHolder(itemView)
    }

    override fun getItemCount() = garderob.size

    override fun onBindViewHolder(holder: GarderobViewHolder, position: Int) {
        val clothes = garderob[position]
        holder.nameTV.text = clothes.name
        holder.descriptionTV.text = clothes.description
        holder.imageIV.setImageResource(clothes.image)
    }
}