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
import com.example.hackaton.databinding.FragmentHikingBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.HikingViewModel

class HikingFragment : Fragment(R.layout.fragment_hiking) {

    private var binding: FragmentHikingBinding? = null
    private lateinit var viewModel: HikingViewModel
    private var adapterHiking: AdapterPlace? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HikingViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHikingBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewHiking = binding.rvHiking
        adapterHiking = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url =
                        "https://www.google.com/maps/d/u/0/embed?mid=123L3iOpZTxonWoOKQMoJ0vtclp8&ll=38.79251679692439%2C-9.386229050000006&z=15"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url =
                        "https://www.google.com/maps/d/u/0/embed?mid=123L3iOpZTxonWoOKQMoJ0vtclp8&ll=38.79251679692439%2C-9.386229050000006&z=15"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url = "https://www.wikiloc.com/hiking-trails/azenhas-do-mar-26670591"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url =
                        "https://www.wikiloc.com/hiking-trails/ruta-convento-dos-capuchos-anta-andrenunes-santuario-de-peninha-parque-natural-de-sintra-y-cascais-10838693"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url =
                        "https://www.wikiloc.com/hiking-trails/sintra-cabo-da-roca-praia-da-ursa-azoia-loop-62666012"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url =
                        "https://www.wikiloc.com/hiking-trails/pria-adraga-pria-da-ursa-cabo-da-roca-and-back-26071290"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 6) {
                    val url =
                        "https://www.wikiloc.com/hiking-trails/praia-do-ribeiro-do-cavalo-16337227"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 7) {
                    val i = Intent(Intent.ACTION_VIEW)
                    val url = "https://www.wikiloc.com/mountaineering-trails/vigia-dificil-33729122"
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 8) {
                    val url =
                        "https://www.wikiloc.com/hiking-trails/trilho-do-lenhador-monsanto-11177870"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 9) {
                    val url = "https://www.wikiloc.com/hiking-trails/miradouro-panoramico-61383883"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 10) {
                    val url =
                        "https://www.google.com/maps/d/u/0/embed?mid=1PwSQ9y0H8JGx7Vr_wM9XVbgc5Fw&ll=38.77549728134979%2C-9.446461955085397&z=13"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 11) {
                    val url =
                        "https://www.wikiloc.com/hiking-trails/penedo-tholos-do-monge-pedra-amarela-capuchos-penedo-60199005"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }
        })
        adapterHiking!!.setDataSource(getTrails())
        recyclerViewHiking.adapter = adapterHiking
        recyclerViewHiking.layoutManager = GridLayoutManager(activity, 2)

    }

    private fun getTrails(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable.pena, "Palacio do Pena"))
        list.add(Place(R.drawable.moorish, "Moorish Castle"))
        list.add(Place(R.drawable.azenhas, "Azenhas do Mar"))
        list.add(Place(R.drawable.anta, "Anta de Andreunes"))
        list.add(Place(R.drawable.roca, "Cabo da Roca"))
        list.add(Place(R.drawable.adraga, "Praia da Adraga"))
        list.add(Place(R.drawable.cavalo, "Praia da Ribeira\n" + " do Cavalo"))
        list.add(Place(R.drawable.lookoutsetubal, "   São Luís\n" + "Lookout Loop"))
        list.add(Place(R.drawable.circular, "Circular Route \n" + " Monsanto"))
        list.add(Place(R.drawable.miradouromonstanto, "Miradouro da \n" + "Luneta dos Quartéis"))
        list.add(Place(R.drawable.barragem, "Barragem do \n" + "Rio da Mula "))
        list.add(Place(R.drawable.tholos, "Tholos do Monge \n" + " and Pedra Amarela"))
        return list
    }

}