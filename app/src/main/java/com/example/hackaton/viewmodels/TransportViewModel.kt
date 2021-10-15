package com.example.hackaton.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hackaton.R
import com.example.hackaton.models.MetroStation

class TransportViewModel : ViewModel() {
    val s = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val s2 = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val s3 = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val s4 = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val s5 = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val s6 = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val s7 = MutableLiveData<ArrayList<Int>>(arrayListOf())
    val l = MutableLiveData<ArrayList<MetroStation>>(arrayListOf())
    init {
        s.value!!.add(R.drawable.azul)
        s.value!!.add(R.drawable.amarela)
        l.value!!.add(MetroStation("Marques de Pombal \n Metro Station", s.value!!, R.drawable.marques))
        s2.value!!.add(R.drawable.vermelha)
        l.value!!.add(MetroStation("Oriente \n Metro Station", s2.value!!, R.drawable.oriente))
        s3.value!!.add(R.drawable.vermelha)
        l.value!!.add(MetroStation("Aeroporto \n Metro Station", s3.value!!, R.drawable.aeroporto))
        s4.value!!.add(R.drawable.verde)
        s4.value!!.add(R.drawable.amarela)
        l.value!!.add(MetroStation("Campo Grande \n Metro Station", s4.value!!, R.drawable.campogrande))
        s5.value!!.add(R.drawable.azul)
        s5.value!!.add(R.drawable.verde)
        l.value!!.add(MetroStation("Baixa-Chiado \n Metro Station", s5.value!!, R.drawable.baixa_chiado))
        s6.value!!.add(R.drawable.verde)
        l.value!!.add(MetroStation("Cais do Sodre \n Metro Station", s6.value!!, R.drawable.cais))
        s7.value!!.add(R.drawable.azul)
        l.value!!.add(MetroStation("Jardim Zoologico \n Metro Station", s7.value!!, R.drawable.jardim))
    }
    fun getMetroStations():MutableLiveData<ArrayList<MetroStation>>{
        return l
    }
}