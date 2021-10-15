package com.example.hackaton.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hackaton.databinding.FragmentTransportBinding
import com.example.hackaton.ui.adapters.AdapterStations
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.TransportViewModel

class TransportFragment : Fragment() {
    private var binding: FragmentTransportBinding? = null
    private lateinit var viewModel: TransportViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TransportViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTransportBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val recyclerView = binding!!.recyclerView
        viewModel.getMetroStations().observe(viewLifecycleOwner, {
            val adapterMetroStations =
                AdapterStations(object : IOnClickListener {
                    override fun onItemClick(position: Int) {
                        if (position == 0) {
                            val url =
                                "https://www.google.com/maps/place/Marqu%C3%AAs+de+Pombal/@38.725266,-9.1522492,17z/data=!3m1!4b1!4m5!3m4!1s0xd1933772ddf7079:0xbd88fe8d5ed78a8f!8m2!3d38.725266!4d-9.1500605"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                        if (position == 1) {
                            val url =
                                "https://www.google.com/maps/place/Oriente/@38.7678423,-9.1015336,17z/data=!4m12!1m6!3m5!1s0xd193187d114c809:0xbe2b7b794170743e!2sGara+Oriente!8m2!3d38.7678423!4d-9.0993449!3m4!1s0xd193187dce40421:0x4ab75a98da99969b!8m2!3d38.7677679!4d-9.0990776"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                        if (position == 2) {
                            val url =
                                "https://www.google.com/maps/place/Aeroporto/@38.7691246,-9.1306482,17z/data=!3m1!4b1!4m5!3m4!1s0xd1932469b300003:0x76aef125bc3f8048!8m2!3d38.7691246!4d-9.1284595"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                        if (position == 3) {
                            val url =
                                "https://www.google.com/maps/place/Campo+Grande+(Metro)/@38.7603367,-9.1579833,16.31z/data=!4m5!3m4!1s0xd1932e4dbd9c16d:0x9e6e91e47667e297!8m2!3d38.7604345!4d-9.1565074"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                        if (position == 4) {
                            val url =
                                "https://www.google.com/maps/place/Baixa-Chiado/@38.7105499,-9.1442586,17z/data=!3m1!4b1!4m5!3m4!1s0xd1934792739f59d:0xb88a6ef813b5e537!8m2!3d38.7105499!4d-9.1420699"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                        if (position == 5) {
                            val url =
                                "https://www.google.com/maps/place/Cais+do+Sodr%C3%A9/@38.7060358,-9.1469441,17z/data=!4m8!1m2!2m1!1scais+do+sodre+metro!3m4!1s0xd19347d8dc12f6f:0xbacc726ccb718a9a!8m2!3d38.7061632!4d-9.1451406"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                        if (position == 6) {
                            val url =
                                "https://www.google.com/maps/place/Jardim+Zool%C3%B3gico/@38.7420722,-9.1711235,17z/data=!3m1!4b1!4m5!3m4!1s0xd19333d4cb6e8e7:0x269e2f2c35d5886!8m2!3d38.7420722!4d-9.1689348"
                            val i = Intent(Intent.ACTION_VIEW)
                            i.data = Uri.parse(url)
                            startActivity(i)
                        }
                    }

                })
            adapterMetroStations.setDataSource(it)
            recyclerView.adapter = adapterMetroStations
            adapterMetroStations.notifyDataSetChanged()
        })


    }
}