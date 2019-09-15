package com.example.android.slider.fragments.homefragment

import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.slider.R
import com.example.android.slider.adapter.Home3RecyclerAdapter
import com.example.android.slider.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.homefragmentlproject4.view.*
import kotlinx.android.synthetic.main.homefragmentproject3.*
import kotlinx.android.synthetic.main.homefragmentproject3.view.*
import kotlinx.android.synthetic.main.homefragmentproject3.view.viewpager
import java.util.*

class HomeFragmentProject3 :Fragment(){
    var currentPage:Int=0
    var  NUM_PAGES:Int=5
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view:View=inflater.inflate(R.layout.homefragmentproject3,container,false)
       view.viewpager.adapter=ViewPagerAdapter()

        view.indicator.setViewPager(view.viewpager)
        swipeViewPager()
        view.recyclerView.adapter= Home3RecyclerAdapter()
        view.recyclerView.setLayoutManager(GridLayoutManager(getContext(),3))

        return view
    }
    fun swipeViewPager(){
        val handler = Handler()
        val update=Runnable(){
            if (currentPage == NUM_PAGES){
                currentPage=0
            }
            view!!.viewpager.setCurrentItem(currentPage++,true)
        }
        val swipTimer= Timer()
        swipTimer.schedule( object : TimerTask(){
            override fun run() {
                handler.post(update)
            }
        }
            ,500,3000)



    }
}