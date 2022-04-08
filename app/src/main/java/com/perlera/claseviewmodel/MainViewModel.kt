package com.perlera.claseviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    var query = MutableLiveData("")
    var result = MutableLiveData("")

    fun onSearch(){
        result.value = "Este es el resultado de la busqueda usando el ${query.value}"
    }
}