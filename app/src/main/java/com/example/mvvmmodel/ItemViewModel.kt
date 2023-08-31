package com.example.mvvmmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ItemViewModel:ViewModel() {
    val response=MutableLiveData<List<Result>>()
    var api=RetrofitItem().getInstance().create(ItemApi::class.java)
    fun getData(){
        try {
            viewModelScope.launch{
                var res=api.getDatas()
                response.value=res.body()?.results
            }
        }
        catch (e:Exception){
            println(e.message)
        }
    }
}