package com.example.hackaton.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hackaton.R
import com.example.hackaton.models.MetroLine

class AdapterSubway(private var list: ArrayList<MetroLine>, val onClickListener: OnClickListener):
RecyclerView.Adapter<AdapterSubway.ViewHolder>()
{
    interface OnClickListener
    {
        fun onItemClick(position:Int)
    }
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.card_subway,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.apply {
           itemView.findViewById<TextView>(R.id.name).text=list[position].name
           itemView.findViewById<TextView>(R.id.route).text=list[position].route
           itemView.findViewById<ImageView>(R.id.ivLine2).setImageResource(list[position].image)
           holder.itemView.setOnClickListener {
               onClickListener.onItemClick(position)
           }
       }
    }

    override fun getItemCount(): Int {
       return list.size
    }

}