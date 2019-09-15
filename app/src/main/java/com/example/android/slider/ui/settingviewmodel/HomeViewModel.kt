package com.example.android.slider.ui.settingviewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.android.slider.datalayer.Repo.ProductsInfoReposotories
import com.example.android.slider.datalayer.Repo.SettingRepo
import com.example.android.slider.datalayer.usecases.ProductUseCase

import com.example.android.slider.datalayer.usecases.SettingsUseCase

class HomeViewModel:ViewModel(){
    var settingReporository: SettingRepo = SettingRepo()
    var settingsResponse: MutableLiveData<List<SettingsUseCase>>?=null
    var mainProductsRep:ProductsInfoReposotories= ProductsInfoReposotories()
    var productsResponse:MutableLiveData<List<ProductUseCase>>?=null
    var errormessage: MutableLiveData<String>?= null
    init {
        settingsResponse  = MutableLiveData()
        errormessage=MutableLiveData()
        productsResponse= MutableLiveData()

    }
    fun getSettings(){
        settingReporository.getSettings(settingsResponse,errormessage)
    }
   fun getProduct(){
       mainProductsRep.getProduct(productsResponse,errormessage)
   }
}