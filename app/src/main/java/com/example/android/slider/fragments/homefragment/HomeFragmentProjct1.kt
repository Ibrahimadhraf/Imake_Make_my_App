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
import com.example.android.slider.adapter.FamousProductAdapter
import com.example.android.slider.adapter.ProductViewAdapter
import com.example.android.slider.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.homefragmentproject1.*
import kotlinx.android.synthetic.main.homefragmentproject1.view.*


class HomeFragmentProjct1:Fragment(){
    var currentPage: Int = 0
    var NUM_PAGES: Int = 3
    lateinit var project1ViewModel: HomeProject1ViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view:View=inflater.inflate(R.layout.homefragmentproject1,container,false)
      //  view.viewpager?.adapter= ViewPagerAdapter()
        project1ViewModel= ViewModelProviders.of(this).get(HomeProject1ViewModel::class.java)
       // val url:String="http://imakeapp.codesroots.com/assets/images/logo.png"
       // Picasso.get().load(url).into(imageView5)
        project1ViewModel.swipeViewPager()
        project1ViewModel.viewPager?.observe(this , android.arch.lifecycle.Observer{
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            viewpager.setCurrentItem(currentPage++, true)
            imageView5.setBlur(5)
        })
      view.chdepatment1?.adapter= ProductViewAdapter()
       view.chdepatment1?.setLayoutManager(LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true))
        // view.product_recyclerView?.adapter= FamousProductAdapter()
        view.product_recyclerView.setLayoutManager(GridLayoutManager(getContext(),2))
        return view

    }
}
