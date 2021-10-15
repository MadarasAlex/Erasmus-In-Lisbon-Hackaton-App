package com.example.hackaton.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackaton.databinding.CardStationsBinding
import com.example.hackaton.models.MetroStation
import com.example.hackaton.ui.interfaces.IOnClickListener

class AdapterStations(var clickListener: IOnClickListener) :
    RecyclerView.Adapter<AdapterStations.ViewHolder>() {
    inner class ViewHolder(private val binding: CardStationsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MetroStation) {
            binding.item = item
            binding.ivStationImage.setImageResource(item.image)
            binding.listener = clickListener
            binding.tvStationName.text = item.text
            if (item.lines.size > 1) {
                binding.ivLine1.setImageResource(item.lines[0])
                binding.ivLine2.setImageResource(item.lines[1])
            } else binding.ivLine3.setImageResource(item.lines[0])
            binding.executePendingBindings()
        }
    }

    private var list: List<MetroStation> = ArrayList()
    fun setDataSource(items: List<MetroStation>) {
        this.list = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CardStationsBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}