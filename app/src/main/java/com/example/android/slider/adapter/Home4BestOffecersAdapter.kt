package com.example.android.slider.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.home4bestoffers.view.*
import android.graphics.Paint
import com.example.android.slider.R
import com.example.android.slider.databinding.Home4bestoffersBinding



class Home4BestOffecersAdapter :RecyclerView.Adapter<Home4BestOffecersAdapter.Home4BestOffecersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): Home4BestOffecersViewHolder {
        val binding: Home4bestoffersBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.home4bestoffers,
            parent,
            false
        )
        return Home4BestOffecersViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 5

    }

    override fun onBindViewHolder(holder: Home4BestOffecersViewHolder, position: Int) {
        holder.itemView.textView17.setPaintFlags(holder.itemView.textView17.getPaintFlags() or Paint.STRIKE_THRU_TEXT_FLAG)

    }

    class Home4BestOffecersViewHolder(val view: Home4bestoffersBinding):RecyclerView.ViewHolder(view.root)
}