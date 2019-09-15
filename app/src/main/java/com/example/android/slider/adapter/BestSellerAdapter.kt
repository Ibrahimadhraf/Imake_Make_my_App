package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R

class BestSellerAdapter:RecyclerView.Adapter<BestSellerAdapter.BestRateViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): BestRateViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.bestrate_products,parent,false)
        return BestRateViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 5
    }

    override fun onBindViewHolder(p0: BestRateViewHolder, p1: Int) {
    }

    class BestRateViewHolder(val view:View):RecyclerView.ViewHolder(view){}
}