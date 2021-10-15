package com.example.hackaton.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackaton.databinding.FragmentSubwayBinding
import com.example.hackaton.ui.adapters.AdapterSubway
import com.example.hackaton.viewmodels.SubwayViewModel

class SubwayFragment : Fragment() {
    private var binding: FragmentSubwayBinding? = null
    private lateinit var viewModel: SubwayViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SubwayViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubwayBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val recyclerView = binding?.recyclerView
        viewModel.getMetroLines().observe(viewLifecycleOwner, {
            val adapterSubway = AdapterSubway(it, object : AdapterSubway.OnClickListener {
                override fun onItemClick(position: Int) {
                    if (position == 0) {
                        val url = "https://en.wikipedia.org/wiki/Yellow_Line_(Lisbon_Metro)"
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(i)
                    }
                    if (position == 1) {
                        val url = "https://en.wikipedia.org/wiki/Green_Line_(Lisbon_Metro)"
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(i)
                    }
                    if (position == 2) {
                        val url = "https://en.wikipedia.org/wiki/Blue_Line_(Lisbon_Metro)"
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(i)
                    }
                    if (position == 3) {
                        val url = "https://en.wikipedia.org/wiki/Red_Line_(Lisbon_Metro)"
                        val i = Intent(Intent.ACTION_VIEW)
                        i.data = Uri.parse(url)
                        startActivity(i)
                    }
                }

            })
            recyclerView!!.adapter = adapterSubway
            recyclerView.isNestedScrollingEnabled = false
            recyclerView.stopNestedScroll()

            adapterSubway.notifyDataSetChanged()
        })
    }

}