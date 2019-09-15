package com.example.android.slider.ui.slidershow

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.slider.MainActivity
import com.example.android.slider.R
import com.example.android.slider.datalayer.usecases.SettingsUseCase
import com.example.android.slider.datalayer.usecases.SplashUsecase
import com.example.android.slider.ui.splash.SplashUi
import com.example.android.slider.ui.splash.SplashViewModel
import kotlinx.android.synthetic.main.activity_slider.*
import kotlinx.android.synthetic.main.activity_slider.indicator
import java.io.Serializable


class SliderShow : AppCompatActivity() {
    companion object{
        val SETTINGUSECASEkEY:String = "Settings"
    }
    var settings_data: List<SettingsUseCase>? = null

    var currentPage: Int = 0
    var NUM_PAGES: Int = 3
    lateinit var viewModel: SplashViewModel

    var slider:List<SplashUsecase>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)
        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)

        viewModel.getData()
        viewModel.clientsResponseLD?.observe(this,android.arch.lifecycle.Observer {
           println(it)
            slider=it
            slidwershowViewPager.adapter= SliderViewPagerAdapter(this,slider)
            indicator.setViewPager(slidwershowViewPager)
        })
        viewModel.viewPager?.observe(this,android.arch.lifecycle.Observer{
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            slidwershowViewPager.setCurrentItem(currentPage++, true)
        })
        val intent: Intent? = getIntent()
        settings_data = intent?.getSerializableExtra(SplashUi.SETTINGUSECASEkEY) as List<SettingsUseCase>
        skip_text.setOnClickListener {
            val send_intent = Intent(this, MainActivity::class.java)

            send_intent.putExtra(SETTINGUSECASEkEY, settings_data as Serializable)
            startActivity(send_intent)
            finish()
            startActivity(send_intent)
              finish()
        }
        nextImage.setOnClickListener {

            viewModel.swipeViewPager()
        }

    }



}
