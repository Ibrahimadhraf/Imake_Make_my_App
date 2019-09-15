package com.example.android.slider.adapter

import android.support.v7.widget.RecyclerView
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.android.slider.R
import com.example.android.slider.databinding.*
import com.example.android.slider.datalayer.usecases.SettingsUseCase
import kotlinx.android.synthetic.main.home4bestoffers.view.*
import kotlinx.android.synthetic.main.typelayout_product_1.view.*
import kotlinx.android.synthetic.main.typeproductlayout_2.view.*


class FamousProductAdapter(val settings:List<SettingsUseCase>?): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    // holder.itemView.type_product.setTextColor(color)
    }


    var TYPE_FIRST_ITEM = 0
    var TYPE_ITEM = 1
    var view :Int=2;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

            if (viewType == TYPE_FIRST_ITEM) {
                view = R.layout.typelayout_product_1

                val binding: TypelayoutProduct1Binding = DataBindingUtil.inflate(
                    LayoutInflater.from(parent.context),
                    view,
                    parent,
                    false
                )


                //binding.depshimmer.startShimmerAnimation()
                binding.typelayoutInfo=settings!!.get(4)

                binding.executePendingBindings()
                return BigViewHolder(binding)
            }

            if (viewType == TYPE_ITEM) {

                view = R.layout.typeproductlayout_2
            }
            val binding2: Typeproductlayout2Binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                view,
                parent,
                false
            )
        binding2.typelayoutInfo=settings!!.get(4)
        binding2.executePendingBindings()
        //binding2.depshimmer.startShimmerAnimation()
            return NormalViewHolder(binding2)
        }


    override fun getItemCount(): Int {
        return 5

    }

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            return TYPE_FIRST_ITEM;
        } else return TYPE_ITEM;
    }




    class NormalViewHolder( val binding1:Typeproductlayout2Binding) : RecyclerView.ViewHolder(binding1.root)

     class BigViewHolder( val binding2:  TypelayoutProduct1Binding) : RecyclerView.ViewHolder(binding2.root)

    companion object {

        val TYPE_FIRST_ITEM = 0
        val TYPE_ITEM = 1
    }
}