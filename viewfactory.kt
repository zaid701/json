package com.example.recycle

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class viewfactory(val postreposetory: postreposetory):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return  viewmodel(postreposetory) as T
    }
}