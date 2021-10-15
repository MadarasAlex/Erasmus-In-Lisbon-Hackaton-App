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
import com.example.hackaton.databinding.FragmentBarsBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.BarsViewModel

class BarsFragment : Fragment() {
    private var binding: FragmentBarsBinding? = null
    private lateinit var viewModel: BarsViewModel
    private var adapterBars: AdapterPlace? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BarsViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBarsBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewBars = binding.rvBars
        adapterBars = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url =
                        "https://www.instagram.com/o_aviao_bairroalto/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url =
                        "https://onceuponajrny.com/destinations/europe/portugal/cais-do-sodre-pink-street-lisbon/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url = "https://erasmuslifelisboa.com/vai-acima-e-botabaixo/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url = "https://www.facebook.com/incognitobar"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url = "https://www.facebook.com/SHORTYS-BAR-777765199243030"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url = "https://www.facebook.com/cornerlisbon"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 6) {
                    val url = "https://www.facebook.com/ArrozdoceBar"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 7) {
                    val url =
                        "https://www.google.com/maps/place/Miradouro+de+S%C3%A3o+Pedro+de+Alc%C3%A2ntara/@38.7152302,-9.1463595,17z/data=!3m1!4b1!4m5!3m4!1s0xd19338037000861:0x1beb7972336de3a1!8m2!3d38.7152302!4d-9.1441708"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 8) {
                    val url = "https://www.facebook.com/CINCO.lounge"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 9) {
                    val url = "https://www.google.com/maps/@38.7053251,-9.1436658,18z"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 10) {
                    val url = "https://www.facebook.com/portaslargaslisboa"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 11) {
                    val url = "https://www.facebook.com/cheerslisbon"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }
        })
        adapterBars?.setDataSource(getBars())
        recyclerViewBars.adapter = adapterBars
        recyclerViewBars.layoutManager = GridLayoutManager(activity, 2)

    }

    private fun getBars(): ArrayList<Place> {
        val list = ArrayList<Place>()

        list.add(Place(R.drawable.oaviao2, "O Aviao"))
        list.add(Place(R.drawable.erasmuscorner, "Erasmus Corner"))
        list.add(Place(R.drawable.incognito, "Incógnito"))
        list.add(Place(R.drawable.pinkstreet, "Pink Street"))
        list.add(Place(R.drawable.shortys, "Shorty's"))
        list.add(Place(R.drawable.irish, "The Corner Irish Pub"))
        list.add(Place(R.drawable.arrozdoce, "Arroz Doce Bar"))
        list.add(Place(R.drawable.miradourosaop, "Miradouro do \n" + "Sao Pedro"))
        list.add(Place(R.drawable.cincolounge, "CINCO Lounge"))
        list.add(Place(R.drawable.caisbench, "Cais do Sodre \n Terminal"))
        list.add(Place(R.drawable.portaslargas, "Portas Largas"))
        list.add(Place(R.drawable.cheersirish, "Cheers Irish Pub"))

        return list
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}