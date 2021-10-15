package com.example.hackaton.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hackaton.R
import com.example.hackaton.databinding.FragmentSurfBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.SurfViewModel

class SurfFragment : Fragment(R.layout.fragment_surf) {
    private var binding: FragmentSurfBinding? = null
    private lateinit var viewModel: SurfViewModel
    private var adapterSurf: AdapterPlace? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SurfViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSurfBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewHome = binding.rvSurf
        adapterSurf = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url =
                        "https://www.google.com/maps/place/Praia+do+Tarqu%C3%ADnio-Para%C3%ADso/@38.6370093,-9.2426333,15.09z/data=!4m13!1m7!3m6!1s0xd1eb53c5f7d98b9:0xdaa473dfcbc0b00!2sPraia+da+Bela+Vista!3b1!8m2!3d38.596151!4d-9.208109!3m4!1s0xd1eca60b7082755:0x4c3f6e166bf974be!8m2!3d38.6419643!4d-9.2391908"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url =
                        "https://www.google.com/maps/place/Carcavelos+beach/@38.6792731,-9.3405832,16z/data=!3m1!4b1!4m5!3m4!1s0xd1ec8c2dfdc70cd:0x5b1c934a3f472609!8m2!3d38.6795953!4d-9.3360168"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url =
                        "https://www.google.com/maps/place/Po%C3%A7a+Beach/@38.7019513,-9.4007511,15z/data=!3m1!4b1!4m5!3m4!1s0xd1ec5dd1ea04337:0x13e4d4437ec07404!8m2!3d38.7019521!4d-9.3919963"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url =
                        "https://www.google.com/maps/place/Guincho+Beach/@38.7308278,-9.482602,15z/data=!3m1!4b1!4m5!3m4!1s0xd1ec37433612873:0x46059809efed9659!8m2!3d38.7308287!4d-9.4738472"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url =
                        "https://www.google.ro/maps/place/Praia+do+Sul/@38.9585411,-9.4229676,15z/data=!4m8!1m2!2m1!1spraia+da+sul!3m4!1s0xd1f27744118b1d3:0x63a68e8fb873b98b!8m2!3d38.958542!4d-9.4142128?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url =
                        "https://www.google.ro/maps/place/Praia+das+Ma%C3%A7%C3%A3s/@38.8256256,-9.4874572,14z/data=!4m8!1m2!2m1!1spraia+da+macas!3m4!1s0xd1edc720213caf9:0x16a0d43b7e80ed7!8m2!3d38.824968!4d-9.4699476?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }

        })
        adapterSurf?.setDataSource(getSurfBeaches())
        recyclerViewHome.adapter = adapterSurf
        recyclerViewHome.layoutManager = GridLayoutManager(activity, 2)
    }

    private fun getSurfBeaches(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable.costacaparica, "Praia Costa de\n" + "    Caparica"))
        list.add(Place(R.drawable.carcavelos, "Praia do \n" + "Carcavelos"))
        list.add(Place(R.drawable.poca, "Praia da Poca"))
        list.add(Place(R.drawable.guincho, "Guincho"))
        list.add(Place(R.drawable.praiasulericeira, "Praia do Sul"))
        list.add(Place(R.drawable.macas, "Praia das Macas"))
        return list
    }

}