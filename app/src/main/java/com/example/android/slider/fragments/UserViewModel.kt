package com.example.android.slider.fragments


import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.BindingAdapter
import android.graphics.Color
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide


@BindingAdapter("app:imageResource")
fun setImageResource(imageView: ImageView?, resource: String?) {
 Glide.with(imageView?.context!!).load(resource).into(imageView)
}

@BindingAdapter("android:backgroundColor")
fun ViewGroup.setBackground(backgroundColor: String) {

 val color: Int = try {
  Color.parseColor(backgroundColor)
 } catch (e: Exception) {
  Color.parseColor("$#background")
 }
 setBackgroundColor(color)
}


class UserViewModel:ViewModel() {
  var viewPager:MutableLiveData<Int>?=null
init {
 viewPager= MutableLiveData()

}



}
