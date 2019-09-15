package com.example.android.slider.datalayer.usecases

import com.example.android.slider.models.mainpage_products.Category
import com.example.android.slider.models.mainpage_products.ProductModel
import com.example.android.slider.models.mainpage_products.Randproduct
import com.example.android.slider.models.mainpage_products.Slider

class ProductUseCase(val produt:ProductModel?=null) {
    var sliders:List<Slider>?=null
    var category:List<Category>?=null
    var randproduct:List<Randproduct>?=null
    init {
        sliders=produt!!.sliders
        category=produt.category
        randproduct=produt.randproduct
    }

}