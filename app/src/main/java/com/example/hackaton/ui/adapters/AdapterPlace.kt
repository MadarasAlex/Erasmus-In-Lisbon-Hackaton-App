package com.example.hackaton.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.hackaton.databinding.CardPlaceBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.interfaces.IOnClickListener

class AdapterPlace(var clickListener: IOnClickListener) :
    RecyclerView.Adapter<AdapterPlace.ViewHolder>(), Filterable {
    inner class ViewHolder(private val binding: CardPlaceBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Place) {
            binding.item = item
            binding.april.setImageResource(item.picture)
            binding.listener = clickListener
            binding.textApril.text = item.text
            binding.executePendingBindings()
        }

    }


    private var list: List<Place> = ArrayList()
    fun setDataSource(items: List<Place>) {
        this.list = items
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardPlaceBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getFilter(): Filter {
        TODO("Not yet implemented")
    }
}