package com.example.android.slider.datalayer.Repo

import android.arch.lifecycle.MutableLiveData
import com.example.android.slider.datalayer.apiservices.APIServices
import com.example.android.slider.datalayer.usecases.SliderShowUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class SliderRepo {

    fun getSliderShow(livedata: MutableLiveData<List<SliderShowUseCase>>?, errormessage: MutableLiveData<String>?){
        APIServices.create().getSliderShowSata()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { data-> data.data.map { data-> SliderShowUseCase(data) }}
            .subscribe(
                {
                        data->
                    livedata?.postValue(data)
                },
                {
                        error->postError(Throwable(),errormessage)
                }
            )
    }
    fun postError(throwable: Throwable, errormessage: MutableLiveData<String>?) {
        errormessage?.postValue(throwable.toString())
    }

}