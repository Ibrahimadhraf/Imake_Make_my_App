package com.example.android.slider.fragments.homefragment

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R
import com.example.android.slider.adapter.DepartmentRecyclerAdapter
import com.example.android.slider.adapter.Department_show
import com.example.android.slider.ui.settingviewmodel.HomeViewModel
import kotlinx.android.synthetic.main.dep_layout.view.*
import kotlinx.android.synthetic.main.home_fragment.view.*

class HomeFragmentN() :Fragment(){
    lateinit var hpmeViewMdel: HomeViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.home_fragment, container, false)
        hpmeViewMdel= ViewModelProviders.of(this).get(HomeViewModel::class.java)
        hpmeViewMdel.getProduct()
        hpmeViewMdel.productsResponse!!.observe(this , android.arch.lifecycle.Observer{
            print(it)
            view.recyclerView2.adapter=DepartmentRecyclerAdapter(it)
            view.recyclerView2.setLayoutManager(
                LinearLayoutManager(
                    getContext(),
                    LinearLayoutManager.VERTICAL,
                    true
                )
            )
            view.recyclerView4.adapter=Department_show(it)
            view.recyclerView4.setLayoutManager(

                GridLayoutManager(getContext(), 3)
            )
        })

        return view
    }
}