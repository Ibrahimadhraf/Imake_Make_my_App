package com.example.android.slider.datalayer.Repo


import android.annotation.SuppressLint
import android.arch.lifecycle.MutableLiveData
import com.example.android.slider.datalayer.apiservices.APIServices
import com.example.android.slider.datalayer.usecases.ProductUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ProductsInfoReposotories {
    @SuppressLint("CheckResult")
    fun getProduct(productLiveData: MutableLiveData<List<ProductUseCase>>?, errormessage: MutableLiveData<String>?){
        APIServices.create().getProductsInfo()
            .map { product->product.category!!.map{
                ProductUseCase(product)
            }
            }
            .subscribe({
                    product->
                productLiveData!!.postValue(product)
            },
                {
                        error->
                    postError(error,errormessage)

                }
            )


    }
    fun postError(throwable: Throwable, errormessage: MutableLiveData<String>?) {
        errormessage?.postValue(throwable.toString())
    }
}

