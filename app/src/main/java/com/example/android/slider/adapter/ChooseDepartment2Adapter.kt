package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R


class ChooseDepartment2Adapter :RecyclerView.Adapter<ChooseDepartment2Adapter.ChooseDepart2Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ChooseDepart2Holder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.choosedep_2_layout,parent,false)
        return ChooseDepartment2Adapter.ChooseDepart2Holder(view)
    }

    override fun getItemCount(): Int {
       return 5
    }

    override fun onBindViewHolder(p0: ChooseDepart2Holder, p1: Int) {

    }

    class ChooseDepart2Holder(val view: View): RecyclerView.ViewHolder(view){}
}