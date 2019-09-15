package com.example.android.slider.models.mainpage_products
data class ProductModel (
    val sliders: List<Slider>? = null,
    val category: List<Category>? = null,
    val randproduct: List<Randproduct>? = null
)

data class Category (
    val id: Long? = null,
    val photo: String? = null,
    val name:String?=null,
    val subcats: List<Subcat>? = null
)

data class Subcat (
    val id: Long? = null,
    val name: String? = null,
    val categoryID: Long? = null,
    val photo: String? = null,
    val icon: String? = null,
    val created: Any? = null,
    val modified: Any? = null,
    val nameAr: Any? = null
)

data class Randproduct (
    val id: Long? = null,
    val totalRating: List<TotalRating>? = null,
    val productphotos: List<Productphoto>? = null,
    val productsizes: List<Productsize>? = null
)

data class Productphoto (
    val id: Long? = null,
    val photo: String? = null,
    val main: String? = null,
    val productID: Long? = null,
    val created: String? = null,
    val modified: String? = null
)

data class Productsize (
    val id: Long? = null,
    val productID: Long? = null,
    val size: String? = null,
    val created: String? = null,
    val modified: String? = null
)

data class TotalRating (
    val productID: Long? = null,
    val stars: Long? = null,
    val count: Long? = null
)

data class Slider (
    val photo: String? = null
)



