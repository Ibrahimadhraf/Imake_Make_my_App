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
import com.example.android.slider.adapter.*
import kotlinx.android.synthetic.main.homefragmentproject1.*
import kotlinx.android.synthetic.main.homefragmentproject1.view.*
import kotlinx.android.synthetic.main.homefragmentproject2.*
import kotlinx.android.synthetic.main.homefragmentproject2.view.*




class HomeFragmentProject2 :Fragment(){
    var currentPage: Int = 0
    var NUM_PAGES: Int = 3
    lateinit var project2ViewModel: HomeProject2ViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view:View=inflater.inflate(R.layout.homefragmentproject2,container,false)
      //  view.viewPager?.adapter= ViewPagerAdapter()
        view.indicator.setViewPager(viewPager)
        project2ViewModel= ViewModelProviders.of(this).get(HomeProject2ViewModel::class.java)
        project2ViewModel.swipeViewPager()
        project2ViewModel.viewPager?.observe(this , android.arch.lifecycle.Observer{
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }

            view.viewPager.setCurrentItem(currentPage++, true)
        })
        view.ch_pro_1.adapter=ChooseDepartment1Adapter()
        view.ch_pro_1.setLayoutManager(GridLayoutManager(getContext(),2))
         view.best_rate.adapter=BestSellerAdapter()
        view.best_rate.setLayoutManager(LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,true))
        view.pro_type_1.adapter=ProductType1Adapter()
        view.pro_type_1.setLayoutManager(GridLayoutManager(getContext(),3))


        return view
    }
}