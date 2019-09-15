package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R
import com.example.android.slider.datalayer.usecases.ProductUseCase
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.product_show.view.*
import java.text.FieldPosition

class Department_show(val product:List<ProductUseCase>?):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.dep_layout,parent,false)
        return DepartmentShowViewHolder(view)
    }

    override fun getItemCount(): Int {
         return product!!.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val image_resource=product!!.get(position).category!!.get(position).photo
        Picasso.get().load(image_resource).into(holder.itemView.product_image)

    }


    class DepartmentShowViewHolder(val view:View):RecyclerView.ViewHolder(view)
}