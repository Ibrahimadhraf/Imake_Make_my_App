package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R
import java.text.FieldPosition

class ProductType2Adapter:RecyclerView.Adapter<ProductType2Adapter.ProductType2ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ProductType2ViewHolder {

        val layoutInflater= LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.typeproductlayout_2,parent,false)
        return ProductType2Adapter.ProductType2ViewHolder(view)
    }

    override fun getItemCount(): Int {

return 5   }

    override fun onBindViewHolder(p0: ProductType2ViewHolder, p1: Int) {

    }

    class ProductType2ViewHolder(val view: View): RecyclerView.ViewHolder(view){}
}