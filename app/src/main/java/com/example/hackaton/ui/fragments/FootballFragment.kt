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
import com.example.hackaton.databinding.FragmentFootballBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.FootballViewModel

class FootballFragment : Fragment(R.layout.fragment_football) {

    private var binding: FragmentFootballBinding? = null
    private lateinit var viewModel: FootballViewModel
    private var adapterFootball: AdapterPlace? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FootballViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFootballBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewFootball = binding.rvFootball
        adapterFootball = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url =
                        "https://www.urbansoccer.pt/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url = "https://cfmonsters.su/#services"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url = "https://www.playarena.pt/index.php/clubs/view_page/486"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url = "https://business.facebook.com/cfmpe/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url = "https://www.playarena.pt/index.php/clubs/view_page/486"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url =
                        "https://www.activitiesinportugal.com/product/5-side-football-pitch-hire-roma-lisbon/"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }
        })
        adapterFootball!!.setDataSource(getFootballFields())
        recyclerViewFootball.adapter = adapterFootball
        recyclerViewFootball.layoutManager = GridLayoutManager(activity, 2)

    }

    private fun getFootballFields(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable.urbansoccer, "Urban Sports" + "\n" + "up to 5v5"))
        list.add(Place(R.drawable.pequeno, "Campo Pequeno" + "\n" + "up to 5v5"))
        list.add(Place(R.drawable.playsportalcantara, "PlayArena Alcantara" + "\n" + "up to 7v7"))
        list.add(Place(R.drawable.espanha, "Praca de Espanha" + "\n" + "up to 6v6"))
        list.add(Place(R.drawable.alvalde, "PlaySports Alvalade" + "\n" + "up to 7v7"))
        list.add(Place(R.drawable.roma, "Roma" + "\n" + "up to 6v6"))

        return list
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}