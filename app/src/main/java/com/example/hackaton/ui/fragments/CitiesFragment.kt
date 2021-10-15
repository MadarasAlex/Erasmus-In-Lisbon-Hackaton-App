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
import com.example.hackaton.databinding.FragmentCitiesBinding
import com.example.hackaton.models.Place
import com.example.hackaton.ui.adapters.AdapterPlace
import com.example.hackaton.ui.interfaces.IOnClickListener
import com.example.hackaton.viewmodels.CitiesViewModel

class CitiesFragment : Fragment(R.layout.fragment_cities) {
    private var binding: FragmentCitiesBinding? = null
    private lateinit var viewModel: CitiesViewModel
    private var adapterCities: AdapterPlace? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CitiesViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCitiesBinding.inflate(inflater, container, false)
        binding!!.executePendingBindings()
        binding!!.lifecycleOwner = this
        binding!!.viewModel = viewModel
        return binding!!.root
    }

    override fun onStart() {
        super.onStart()
        val binding = binding!!
        val recyclerViewCities = binding.rvCities
        adapterCities = AdapterPlace(object : IOnClickListener {
            override fun onItemClick(position: Int) {
                if (position == 0) {
                    val url =
                        "https://www.google.com/maps/place/Sintra,+Portugalia/@38.7884976,-9.4670165,12z/data=!3m1!4b1!4m5!3m4!1s0xd1edac1a7510ee9:0x13585cc0b00f573c!8m2!3d38.8028687!4d-9.3816589"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 1) {
                    val url =
                        "https://www.google.com/maps/place/Cascais,+Portugalia/@38.7150114,-9.4827831,13z/data=!3m1!4b1!4m5!3m4!1s0xd1ec47379b79a97:0x870d3b7e1807bbc2!8m2!3d38.6970565!4d-9.4222945"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 2) {
                    val url =
                        "https://www.google.com/maps/place/Estoril,+Portugalia/@38.7097114,-9.4248129,13z/data=!3m1!4b1!4m5!3m4!1s0xd1ec5c602d62353:0x82c0f730439d4cb1!8m2!3d38.7133152!4d-9.3936558"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 3) {
                    val url =
                        "https://www.google.com/maps/place/Oeiras,+Portugalia/@38.6932966,-9.3479146,13z/data=!3m1!4b1!4m5!3m4!1s0xd1ec92ddb658311:0xa027427cc3993cf7!8m2!3d38.6968607!4d-9.3146014"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 4) {
                    val url =
                        "https://www.google.com/maps/place/Set%C3%BAbal+Municipality,+Portugalia/@38.5236837,-8.9341428,12z/data=!3m1!4b1!4m5!3m4!1s0xd1942feab027435:0x9ff23f769bb5aa54!8m2!3d38.5260437!4d-8.8909328    "
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 5) {
                    val url =
                        "https://www.google.com/maps/place/Sesimbra,+Portugalia/@38.445472,-9.1153417,14z/data=!3m1!4b1!4m5!3m4!1s0xd19518b4a6daf8d:0xd16dc61d905e068b!8m2!3d38.444217!4d-9.1014903"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 6) {
                    val url =
                        "https://www.google.com/maps/place/Ericeira,+Portugalia/@38.9703818,-9.4340847,13z/data=!3m1!4b1!4m5!3m4!1s0xd1f270eadfd6f97:0x742c0c610c10aa4c!8m2!3d38.9668081!4d-9.406167"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 7) {
                    val i = Intent(Intent.ACTION_VIEW)
                    val url =
                        "https://www.google.com/maps/place/Cacilhas,+Almada,+Portugalia/@38.6807948,-9.1589762,15z/data=!3m1!4b1!4m5!3m4!1s0xd1934f9e0c7fa29:0x500ebbde4905610!8m2!3d38.6861358!4d-9.1492754"
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 8) {
                    val url =
                        "https://www.google.com/maps/place/Almada,+Portugalia/@38.6648313,-9.1927093,13z/data=!3m1!4b1!4m5!3m4!1s0xd19351c09ff1135:0xfca6dceb642ad67a!8m2!3d38.6765238!4d-9.1651047"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 9) {
                    val i = Intent(Intent.ACTION_VIEW)
                    val url =
                        "https://www.google.com/maps/place/Montijo,+Portugalia/@38.7056919,-9.0258476,13z/data=!3m1!4b1!4m5!3m4!1s0xd1939eb3ac02dd7:0x42cc94a7d11be406!8m2!3d38.7055652!4d-8.9741183"
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 10) {
                    val url =
                        "https://www.google.com/maps/place/Seixal,+Portugalia/@38.7056919,-9.0258476,13z/data=!4m5!3m4!1s0xd1949f37102a38f:0xcad3cc13c2d6631!8m2!3d38.6410676!4d-9.0975"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
                if (position == 11) {
                    val url =
                        "https://www.google.com/maps/place/Costa+de+Caparica,+Portugalia/@38.600444,-9.2850399,12z/data=!3m1!4b1!4m5!3m4!1s0xd1eca8ae467a733:0xe095a79fc24de51d!8m2!3d38.6446232!4d-9.2333653"
                    val i = Intent(Intent.ACTION_VIEW)
                    i.data = Uri.parse(url)
                    startActivity(i)
                }
            }
        })
        adapterCities!!.setDataSource(getCities())
        recyclerViewCities.adapter = adapterCities
        recyclerViewCities.layoutManager = GridLayoutManager(activity, 2)

    }

    private fun getCities(): ArrayList<Place> {
        val list = ArrayList<Place>()
        list.add(Place(R.drawable.sintra, "Sintra"))
        list.add(Place(R.drawable.cascais, "Cascais"))
        list.add(Place(R.drawable.oeiras, "Oeiras"))
        list.add(Place(R.drawable.estoril, "Estoril"))
        list.add(Place(R.drawable.setubal, "Setubal"))
        list.add(Place(R.drawable.sesimbra, "Sesimbra"))
        list.add(Place(R.drawable.ericeira, "Ericeira"))
        list.add(Place(R.drawable.cacilhas, "Cacilhas"))
        list.add(Place(R.drawable.almada, "Almada"))
        list.add(Place(R.drawable.montijo, "Montijo"))
        list.add(Place(R.drawable.seixal, "Seixal"))
        list.add(Place(R.drawable.costacaparica, "Costa da Caparica"))
        return list
    }

}