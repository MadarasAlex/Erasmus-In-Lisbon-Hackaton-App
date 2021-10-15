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
import com.example.hackaton.databinding.FragmentMuseumsBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.MuseumsViewModel

class MuseumsFragment : Fragment() {
    private var binding: FragmentMuseumsBinding? = null
    private lateinit var viewModel: MuseumsViewModel
    private var adapterMuseums: AdapterPlace? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MuseumsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMuseumsBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewMuseums = binding.rvMuseums
        adapterMuseums = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url = "https://www.facebook.com/maatmuseum"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url = "https://www.facebook.com/museumilitardelisboa"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url = "https://www.facebook.com/MUSEU-DA-CARRIS-128206007196745"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url = "https://www.facebook.com/Museu-Nacional-do-Azulejo-179906992042145"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url = "https://www.facebook.com/fundacaocaloustegulbenkian"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url = "https://www.facebook.com/museunacionaldearteantiga"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 6) {
                    val url = "https://www.facebook.com/mudemuseulisboa"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 7) {
                    val url = "https://www.facebook.com/museu.do.fado"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 8) {
                    val url = "https://www.facebook.com/museuberardo"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 9) {
                    val url = "https://www.facebook.com/casa.museu.medeiros.e.almeida"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 10) {
                    val url = "https://www.facebook.com/www.museudoscoches.gov.pt"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 11) {
                    val url = "https://www.facebook.com/museudooriente"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }
        })
        adapterMuseums!!.setDataSource(getMuseums())
        recyclerViewMuseums.adapter = adapterMuseums
        recyclerViewMuseums.layoutManager = GridLayoutManager(activity, 2)
    }

    private fun getMuseums(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable.maat, "MAAT Museum"))
        list.add(Place(R.drawable.military, "Military Museum"))
        list.add(Place(R.drawable.carris, "Carris Museum"))
        list.add(Place(R.drawable.azultejo, "Azulejo Museum"))
        list.add(Place(R.drawable.calouste, "Calouste Gulbenkian  \n              Museum"))
        list.add(Place(R.drawable.ancient, "National Museum \n  of Ancient Art"))
        list.add(Place(R.drawable.mude, "MUDE Museum"))
        list.add(Place(R.drawable.fado, "Museu do Fado"))
        list.add(Place(R.drawable.berardo, "            Berardo \n Collection Museum"))
        list.add(Place(R.drawable.casa_museu, "       Casa-Museu \n Medeiros e Almeida"))
        list.add(Place(R.drawable.nationalcoach, "National Coach\n     Museum"))
        list.add(Place(R.drawable.orient, "Museum of  the Orient"))
        return list
    }
}