package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R

class ChooseDepartment1Adapter :RecyclerView.Adapter<ChooseDepartment1Adapter.ChooseDepart1Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ChooseDepart1Holder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.choosedep_1_layout,parent,false)
        return ChooseDepart1Holder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(p0: ChooseDepart1Holder, p1: Int) {

    }

    class ChooseDepart1Holder(val view:View): RecyclerView.ViewHolder(view){}
}