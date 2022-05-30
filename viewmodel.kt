package com.example.recycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class viewmodel(val ostreposetory: postreposetory):ViewModel() {

    val responselivedats:MutableLiveData<List<Post>> = MutableLiveData()
    fun getpost(){
        viewModelScope.launch {
            ostreposetory.getpost().catch {  }.collect {
                responselivedats.value=it
            }
        }
    }
}