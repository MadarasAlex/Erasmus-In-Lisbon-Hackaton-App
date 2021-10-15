package com.example.hackaton.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.MediaController
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hackaton.R
import com.example.hackaton.databinding.FragmentHomeBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.HomeViewModel

class HomeFragment : Fragment() {
    private var binding: FragmentHomeBinding? = null
    private lateinit var viewModel: HomeViewModel
    private var adapterStudentChoice: AdapterPlace? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewHome = binding.rvStudentChoice
        adapterStudentChoice = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url =
                        "https://www.google.com/maps/place/Podul+25+Aprilie/@38.6896327,-9.1792992,17z/data=!3m1!4b1!4m5!3m4!1s0xd1934b005e2b55f:0x2b356b0c7449fc9d!8m2!3d38.6896327!4d-9.1771105"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url =
                        "https://www.google.com/maps/place/Restaurante+O+Avi%C3%A3o/@38.7142,-9.1469269,17.55z/data=!4m5!3m4!1s0xd1933780d727883:0x8f58ecea9d7c8401!8m2!3d38.7143839!4d-9.1454624"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url =
                        "https://www.google.com/maps/place/Statuia+lui+Hristos/@38.6786369,-9.1735468,17z/data=!4m12!1m6!3m5!1s0xd1934e79edcc73d:0x640bf28fe6e9ea81!2sStatuia+lui+Hristos!8m2!3d38.6786369!4d-9.1713581!3m4!1s0xd1934e79edcc73d:0x640bf28fe6e9ea81!8m2!3d38.6786369!4d-9.1713581"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url =
                        "https://www.google.com/maps/place/Parque+Eduardo+VII/@38.7279262,-9.1557527,16.22z/data=!4m5!3m4!1s0xd1933714bb401f5:0xa9b00861ee1aa2c2!8m2!3d38.7283001!4d-9.1526828"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url =
                        "https://www.google.com/maps/place/LxFactory/@38.7034979,-9.1810617,17z/data=!3m1!4b1!4m5!3m4!1s0xd1934af61dedbe5:0x33ebaaaa14f543ac!8m2!3d38.7034979!4d-9.178873"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url =
                        "https://www.google.com/maps/place/Praia+do+Tarqu%C3%ADnio-Para%C3%ADso/@38.6414425,-9.2405319,16.05z/data=!4m8!1m2!2m1!1sPraias,+Costa+da+Caparica,+Portugalia!3m4!1s0xd1eca60b7082755:0x4c3f6e166bf974be!8m2!3d38.6419643!4d-9.2391908"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }

        })
        adapterStudentChoice?.setDataSource(getPlaces())

        recyclerViewHome.adapter = adapterStudentChoice
        recyclerViewHome.layoutManager=GridLayoutManager(activity,2)


    }

    private fun getPlaces(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable._5_april_bridge, "25th April Bridge"))
        list.add(Place(R.drawable.oaviao2, "O Aviao"))
        list.add(Place(R.drawable.statue_jesus, "Statue of Jesus"))
        list.add(Place(R.drawable.eduardo_vii_park_700x400, "Edward VII Park"))
        list.add(Place(R.drawable.lx, "LX Factory"))
        list.add(Place(R.drawable.caparica, "Caparica Beach"))
        return list
    }
}

