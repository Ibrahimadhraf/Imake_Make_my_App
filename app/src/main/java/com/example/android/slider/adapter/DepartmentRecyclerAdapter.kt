package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R
import com.example.android.slider.datalayer.Repo.ProductsInfoReposotories
import com.example.android.slider.datalayer.usecases.ProductUseCase
import kotlinx.android.synthetic.main.dep_layout.view.*

class DepartmentRecyclerAdapter(val product:List<ProductUseCase>?):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val view=layoutInflater.inflate(R.layout.dep_layout,parent,false)
        return DepartmentViewHolder(view)
    }

    override fun getItemCount(): Int {
          return product!!.size
    }

    override fun onBindViewHolder(parent:RecyclerView.ViewHolder, position: Int) {
      val text:String?= product!!.get(position).category!!.get(position).name
        parent.itemView.department_name.setText(text)

    }


    class DepartmentViewHolder(val view: View):RecyclerView.ViewHolder(view){}
}