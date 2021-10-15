package com.example.hackaton.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hackaton.R
import com.example.hackaton.models.MetroLine

class SubwayViewModel: ViewModel() {
    val subwayLines=MutableLiveData<ArrayList<MetroLine>>(arrayListOf())
    init{
        subwayLines.value?.add(MetroLine("Yellow Line","Odivelas-Rato", R.drawable.amarela))
        subwayLines.value?.add(MetroLine("Green Line","Telheiras-Cais do Sodre", R.drawable.verde))
        subwayLines.value?.add(MetroLine("Blue Line","Reboleira-Santa Apolonia", R.drawable.azul))
        subwayLines.value?.add(MetroLine("Red Line","Sao Sebastiao-Aeroporto", R.drawable.vermelha))
    }
    fun getMetroLines(): MutableLiveData<ArrayList<MetroLine>> {
        return subwayLines
    }
}