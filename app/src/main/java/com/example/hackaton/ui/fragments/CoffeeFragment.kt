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
import com.example.hackaton.databinding.FragmentCoffeeBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.CoffeeViewModel

class CoffeeFragment : Fragment(R.layout.fragment_coffee) {
    private var binding: FragmentCoffeeBinding? = null
    private lateinit var viewModel: CoffeeViewModel
    private var adapterCoffee: AdapterPlace? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CoffeeViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCoffeeBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = binding!!
        val recyclerViewCoffee = binding.rvCoffee
        adapterCoffee = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url = "https://www.facebook.com/bowlsbar"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url = "https://www.facebook.com/manifest.lisbon"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url = "https://www.facebook.com/cphcoffeelab"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url =
                        "https://www.facebook.com/pages/Pastelaria%20Guadalupe/602173736545268/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url =  "https://www.facebook.com/StanislavCafe"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url = "https://www.facebook.com/curvalisboa"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 6) {
                    val url = "https://www.facebook.com/bunaportugal"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 7) {
                    val url = "https://www.facebook.com/LandeauChocolate"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 8) {
                    val url = "https://www.facebook.com/Chiado-Coffee-Beer-929034377149435"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 9) {
                    val url = "https://www.facebook.com/fabricadanata"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 10) {
                    val url = "https://www.facebook.com/cafejanislisboa"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 11) {
                    val url = "https://www.facebook.com/F%C3%A1brica-Coffee-Roasters-106358347814049"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }

            }
        })
        adapterCoffee!!.setDataSource(getCoffee())
        recyclerViewCoffee.adapter = adapterCoffee
        recyclerViewCoffee.layoutManager = GridLayoutManager(activity, 2)

    }

    private fun getCoffee(): ArrayList<Place> {
        val list = ArrayList<Place>()
        //TODO
        list.add(Place(R.drawable.bowls_bar, "Bowl's Bar"))
        list.add(Place(R.drawable.copenhagencoffeelisbon, "Coppenhagen \n" + "Coffee Lab"))
        list.add(Place(R.drawable.manifestcoffee, "Manifest"))
        list.add(Place(R.drawable.stanislav, "Stanislav Café"))
        list.add(Place(R.drawable.curva, "Curva"))
        list.add(Place(R.drawable.fabricacoffee, "Fabrica Coffee"))
        list.add(Place(R.drawable.buna, "Buna"))
        list.add(Place(R.drawable.pastelairaguadalupe, "Pastelaria Guadalupe"))
        list.add(Place(R.drawable.janis, "Café Janis"))
        list.add(Place(R.drawable.landeau_chocolate, "Landeau Chocolate"))
        list.add(Place(R.drawable.chiadocaffe, "Chiado Caffé"))
        list.add(Place(R.drawable.fabricanata, "Fabrica da Nata"))
        return list
    }
}