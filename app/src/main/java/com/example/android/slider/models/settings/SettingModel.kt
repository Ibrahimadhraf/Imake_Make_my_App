package com.example.android.slider.models.settings

import java.io.Serializable


data class SettingsModel(
    val data: List<SettingsModelData>
):Serializable

data class SettingsModelData (
    val type: String,
    val data: SettingData
):Serializable

data class SettingData (
    val background: String? = null,
    val red: String? = null,
    val green: String? = null,
    val blue: String? = null,
    val logo: String? = null,
    val right_icon: String? = null,
    val leftIcon: String? = null,
    val templateID: String? = null,
    val templatehtml: String? = null,
    val border: String? = null,
    val shadow: String? = null,
    val first_icon: String? = null,
    val firstLabel: String? = null,
    val second_icon: String? = null,
    val secondLabel: String? = null,
    val third_icon: String? = null,
    val thirdLabel: String? = null,
    val forth_icon: String? = null,
    val forthLabel: String? = null,
    val fontColor: String? = null,
    val fontRed: String? = null,
    val fontGreen: String? = null,
    val fontBlue: String? = null,
    val title: String? = null,
    val fontcolor: String? = null,
    val fontfamily: String? = null,
   val slideTemplete:Int=1,
    val departmentTemp:Int=1,
    val pestrateTemp:Int?=1,
    val slideshow: String? = null,
     val borderColor:String="#008080"
):Serializable