package com.example.android.slider.adapter

import android.annotation.TargetApi
import android.content.Context
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.android.slider.R
import com.example.android.slider.databinding.*
import com.example.android.slider.datalayer.usecases.SettingsUseCase





class Home_Projects4_DepartmentAdapter(val setiings:List<SettingsUseCase>?):RecyclerView.Adapter<RecyclerView.ViewHolder> (){
    var view :Int=0
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerView.ViewHolder{
        if (setiings!!.get(3).departmentTemp == 1) {
            view = R.layout.home_projcts4_department
            val binding: HomeProjcts4DepartmentBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                view,
                parent,
                false
            )

        // binding.depshimmer.startShimmerAnimation()
            binding.productInfo=setiings.get(2)
            binding.executePendingBindings()
            if(setiings.get(2).border=="true") {
              val container:ConstraintLayout=binding.container
                val drawable: GradientDrawable=container.background as GradientDrawable
                val color: Int = try {
                    Color.parseColor(setiings.get(1).borderColor)
                } catch (e: Exception) {
                    Color.parseColor("$#background")
                }
                drawable.setStroke(2,color)
                drawable.setColor(color)

            }



            return Home_Projects4_DepatmentHolder(binding)
        }
        if(setiings.get(3).departmentTemp==2) {
            view = R.layout.productview

            val binding: ProductviewBinding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                view,
                parent,
                false
            )
                binding.productInfo=setiings.get(2)
            binding.executePendingBindings()
            return Home_Projects4_DepatmentHolder1(binding)
        }
        if(setiings.get(3).departmentTemp==3){
            view=R.layout.home3recycle_viewlayout


        val binding: Home3recycleViewlayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            view,
            parent,
            false
        )
            binding.productInfo=setiings.get(2)
            binding.executePendingBindings()
        return Home_Projects4_DepatmentHolder2(binding)
        }
        else{
            view=R.layout.choosedep_1_layout
        }
        val binding: Choosedep1LayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            view,
            parent,
            false
        )
        binding.productInfo=setiings.get(2)
        binding.executePendingBindings()
        return Home_Projects4_DepatmentHolder3(binding)
    }

    override fun getItemCount(): Int {
        return 6
    }
    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {


    }


    class Home_Projects4_DepatmentHolder(val binding: HomeProjcts4DepartmentBinding):RecyclerView.ViewHolder(binding.root){}
    class Home_Projects4_DepatmentHolder1(val binding: ProductviewBinding):RecyclerView.ViewHolder(binding.root){}
    class Home_Projects4_DepatmentHolder2(val binding: Home3recycleViewlayoutBinding):RecyclerView.ViewHolder(binding.root){}
    class Home_Projects4_DepatmentHolder3(val binding: Choosedep1LayoutBinding):RecyclerView.ViewHolder(binding.root){}
}