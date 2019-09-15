package com.example.android.slider.adapter

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch



   class ProductType1Adapter :RecyclerView.Adapter<RecyclerView.ViewHolder>(){

       override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
           val layoutInflater = LayoutInflater.from(parent.context)
           if (position == 0) {
               val view: View =
                   layoutInflater.inflate(com.example.android.slider.R.layout.typelayout_product_1, parent, false)
               return ProductType1ViewHolder(view)
           }
           else {


               val view2: View =
                   layoutInflater.inflate(com.example.android.slider.R.layout.typeproductlayout_2, parent, false)
               return ProductType2ViewHolder(view2)

           }
       }
       override fun getItemCount(): Int {

          return 5
    }
       override fun getItemViewType(position: Int): Int {

           if (position == 0) {
               return 0
           } else return 1

       }

       override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


       }


    class ProductType1ViewHolder(val view:View):RecyclerView.ViewHolder(view){}
       class ProductType2ViewHolder(val view:View):RecyclerView.ViewHolder(view){}
}