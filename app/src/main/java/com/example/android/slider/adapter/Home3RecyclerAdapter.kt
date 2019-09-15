package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Home3RecyclerAdapter :RecyclerView.Adapter<Home3RecyclerAdapter.Home3RecyclerHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Home3RecyclerHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(com.example.android.slider.R.layout.home3recycle_viewlayout, parent, false)
        return Home3RecyclerHolder(view)
    }

    override fun getItemCount(): Int {

        return 12
    }

    override fun onBindViewHolder(p0: Home3RecyclerHolder, p1: Int) {

    }

    class Home3RecyclerHolder(val view: View):RecyclerView.ViewHolder(view){}
}