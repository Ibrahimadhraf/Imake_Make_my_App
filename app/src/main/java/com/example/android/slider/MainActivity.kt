package com.example.android.slider
import android.content.Intent
import android.databinding.DataBindingUtil
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import com.example.android.slider.databinding.ActivityMainBinding
import com.example.android.slider.datalayer.usecases.SettingsUseCase
import com.example.android.slider.fragments.buygtagment.BuyFragment
import com.example.android.slider.fragments.homefragment.HomeFragmentProjcet4
import com.example.android.slider.fragments.morefragment.MoreFragment
import com.example.android.slider.fragments.offersfragment.OffersFragment
import com.example.android.slider.ui.slidershow.SliderShow
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

import android.graphics.drawable.BitmapDrawable
import android.os.Build
import android.support.annotation.RequiresApi
import com.example.android.slider.fragments.homefragment.HomeFragmentN


class MainActivity : AppCompatActivity(),Serializable {
    companion object{
        val SETTINGUSECASEkEY:String = "Settings"
    }
    var settings_data: List<SettingsUseCase>? = null
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        buttomNavigationView.setOnNavigationItemSelectedListener( listener)
        buttomNavigationView.setSelectedItemId(R.id.nav_home)

        val intent: Intent? = getIntent()
       settings_data = intent?.getSerializableExtra(SliderShow.SETTINGUSECASEkEY) as List<SettingsUseCase>
        val bundle = Bundle()
        bundle.putSerializable(SETTINGUSECASEkEY, settings_data as Serializable)

         val homeFragmentProjcet4=HomeFragmentProjcet4()
        homeFragmentProjcet4.setArguments(bundle)
      // BVMenu.findItem(R.id.nav_home).setIcon(R.drawable.ic_home_black_24dp)
      

        val BVMenu = buttomNavigationView.getMenu()

        Picasso.get().load(settings_data!!.get(1).firstIcon).into(object : com.squareup.picasso.Target {
            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                // loaded bitmap is here (bitmap)

             val bit=   ConvertBitmapToDrawable(bitmap)
                BVMenu.findItem(R.id.nav_home).setIcon(bit)
            }

            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {

            }
            fun ConvertBitmapToDrawable(bitmap:Bitmap?):Drawable{
                return BitmapDrawable(resources, bitmap)
            }
            override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {}

        })
        Picasso.get().load(settings_data!!.get(1).secondIcon).into(object : com.squareup.picasso.Target {
            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                // loaded bitmap is here (bitmap)

                val bit=   ConvertBitmapToDrawable(bitmap)
                BVMenu.findItem(R.id.nav_buy).setIcon(bit)
            }

            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {

            }
            fun ConvertBitmapToDrawable(bitmap:Bitmap?):Drawable{
                return BitmapDrawable(resources, bitmap)
            }
            override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {}

        })
        Picasso.get().load(settings_data!!.get(1).thirdIcon).into(object : com.squareup.picasso.Target {
            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                // loaded bitmap is here (bitmap)
                val bit=   ConvertBitmapToDrawable(bitmap)
                BVMenu.findItem(R.id.nav_offers).setIcon(bit)
            }

            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {

            }
            fun ConvertBitmapToDrawable(bitmap:Bitmap?):Drawable{
                return BitmapDrawable(resources, bitmap)
            }
            override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {}

        })
        Picasso.get().load(settings_data!!.get(1).forthIcon).into(object : com.squareup.picasso.Target {
            override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {
                // loaded bitmap is here (bitmap)
                val bit=   ConvertBitmapToDrawable(bitmap)
                BVMenu.findItem(R.id.nav_more).setIcon(bit)
            }

            override fun onPrepareLoad(placeHolderDrawable: Drawable?) {

            }
            fun ConvertBitmapToDrawable(bitmap:Bitmap?):Drawable{
                return BitmapDrawable(resources, bitmap)
            }
            override fun onBitmapFailed(e: Exception?, errorDrawable: Drawable?) {}

        })
        binding.settingusecase = settings_data
        print(settings_data)
        binding.executePendingBindings()

    }
    //add navigation button
    private val listener =
        BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            var selectFragment: Fragment? = null
            when (menuItem.itemId) {
                R.id.nav_home -> selectFragment = HomeFragmentN()
                R.id.nav_buy -> selectFragment = BuyFragment()
                R.id.nav_offers->selectFragment= OffersFragment()
                R.id.nav_more -> selectFragment = MoreFragment()

            }
            assert(selectFragment != null)
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment,
                selectFragment!!
            ).commit()
            true
        }


}


