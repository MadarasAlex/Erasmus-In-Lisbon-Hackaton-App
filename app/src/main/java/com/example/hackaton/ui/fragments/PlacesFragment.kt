package com.example.hackaton.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.hackaton.R
import com.example.hackaton.databinding.FragmentPlacesBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.PlacesViewModel

class PlacesFragment : Fragment(R.layout.fragment_places) {
    private var binding: FragmentPlacesBinding? = null
    private lateinit var viewModel: PlacesViewModel
    private var adapterPlace: AdapterPlace? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PlacesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlacesBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewPlaces = binding.rvPlaces
        adapterPlace = AdapterPlace(object : IOnClickListener {
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
                        "https://www.google.ro/maps/place/The+Pink+Street/@38.7068431,-9.1466057,17z/data=!3m1!4b1!4m5!3m4!1s0xd1935db7faf24b7:0x1dc5a5c44783b29f!8m2!3d38.7068431!4d-9.144417?hl=ro&authuser=0"
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
                        "https://www.google.ro/maps/place/Liftul+Santa+Justa/@38.7121023,-9.1416262,17z/data=!3m1!4b1!4m5!3m4!1s0xd193478b78a8d2f:0xe1147c62e070697c!8m2!3d38.7121301!4d-9.1394297?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url =
                        "https://www.google.ro/maps/place/Ocean%C3%A1rio+de+Lisboa/@38.7635435,-9.0959302,17z/data=!3m1!4b1!4m5!3m4!1s0xd193183750e5809:0x983f2e673a62e130!8m2!3d38.7635435!4d-9.0937415?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 6) {
                    val url =
                        "https://www.google.ro/maps/place/Turnul+Bel%C3%A9m/@38.6915837,-9.218166,17z/data=!3m1!4b1!4m5!3m4!1s0xd1ecb42c3c29c4b:0x3002dcadcf52513f!8m2!3d38.6915837!4d-9.2159773?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 7) {
                    val url =
                        "https://www.google.ro/maps/place/Miradouro+da+Gra%C3%A7a/@38.7163439,-9.1315142,3a,75y,90t/data=!3m8!1e2!3m6!1sAF1QipMn5vPZJZ_H1ahAh7KlWRtcghVkd1gvv-8OM69n!2e10!3e12!6shttps:%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipMn5vPZJZ_H1ahAh7KlWRtcghVkd1gvv-8OM69n%3Dw129-h86-k-no!7i5616!8i3744!4m8!1m2!2m1!1salfama+castle!3m4!1s0xd193389ab8d3963:0x46c80fef319cf9f0!8m2!3d38.7163433!4d-9.1315135?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 8) {
                    val url =
                        "https://www.google.ro/maps/place/Rossio+-+Lisboa/@38.7145879,-9.1435481,16.66z/data=!4m5!3m4!1s0xd193380b84613b5:0xbd82ff30c803ca86!8m2!3d38.7144118!4d-9.1408772?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 9) {
                    val url =
                        "https://www.google.ro/maps/place/Miradouro+de+Santa+Luzia/@38.7115991,-9.1325214,17z/data=!3m1!4b1!4m8!1m2!2m1!1ssanta+luzia+mira!3m4!1s0xd1933849770e4c7:0x41203b21edcd2769!8m2!3d38.7115991!4d-9.1303327?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 10) {
                    val url =
                        "https://www.google.ro/maps/place/Castelul+S%C3%A3o+Jorge/@38.7139092,-9.1356649,17z/data=!3m1!4b1!4m8!1m2!2m1!1salfama+castle!3m4!1s0xd193477b40ec39b:0xb4c0704199e433d7!8m2!3d38.7139092!4d-9.1334762?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 11) {
                    val url =
                        "https://www.google.ro/maps/place/Parque+Florestal+de+Monsanto/@38.7367476,-9.1968434,17z/data=!3m1!4b1!4m5!3m4!1s0xd1ecccc3b1fd217:0x71abd39905b41eba!8m2!3d38.7367476!4d-9.1946547?hl=ro&authuser=0"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }
        })
        adapterPlace?.setDataSource(getPlaces())
        recyclerViewPlaces.adapter = adapterPlace
        recyclerViewPlaces.layoutManager = GridLayoutManager(activity, 2)
    }

    private fun getPlaces(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable._5_april_bridge, "25th April Bridge"))
        list.add(Place(R.drawable.eduardo_vii_park_700x400, "Edward VII Park"))
        list.add(Place(R.drawable.statue_jesus, "Statue of Jesus"))
        list.add(Place(R.drawable.pinkstreet, "Pink Street"))
        list.add(Place(R.drawable.santajusta, "Santa Justa Lift"))
        list.add(Place(R.drawable.oceanarium, "Lisbon Oceanarium"))
        list.add(Place(R.drawable.belemtower, "Tower of Belem"))
        list.add(Place(R.drawable.saopedro, "Miradouro do São Pedro"))
        list.add(Place(R.drawable.rossio, "Rossio Railway Station"))
        list.add(Place(R.drawable.santaluzia, "Miradouro de Santa Luzia"))
        list.add(Place(R.drawable.alfama, "Alfama Castle"))
        list.add(Place(R.drawable.monsanto, "Monsanto Forest Park"))
        return list
    }
}