package com.example.android.slider.adapter

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.constraint.ConstraintLayout
import android.support.v4.view.PagerAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.HActivity
import com.example.android.slider.R
import com.example.android.slider.databinding.Viewpagerimag2Binding
import com.example.android.slider.databinding.Viewpagerimage3Binding
import com.example.android.slider.databinding.ViewpagerimageBinding
import com.example.android.slider.datalayer.usecases.SettingsUseCase


class ViewPagerAdapter(val setiingsList: List<SettingsUseCase>?):PagerAdapter() {
var source :Int =0

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        if(setiingsList!!.get(2).slideTemp==1)
        {

            source = R.layout.viewpagerimage
            val binding: ViewpagerimageBinding = DataBindingUtil.inflate(
                LayoutInflater.from(container.context),
                source,
                container,
                false)
            container.addView(binding.root)

            return binding.root
        }
        if (setiingsList.get(2).slideTemp==2) {
            source = R.layout.viewpagerimag2
            val binding: Viewpagerimag2Binding = DataBindingUtil.inflate(
                LayoutInflater.from(container.context),
                source,
                container,
                false)
            container.addView(binding.root)

            return binding.root
        }
        else {
            source = R.layout.viewpagerimage3
        }
        val binding: Viewpagerimage3Binding = DataBindingUtil.inflate(
            LayoutInflater.from(container.context),
            source,
            container,
            false)

        container.addView(binding.root)

        return binding.root
    }
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun getCount(): Int {
        return 5
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)

    }


}