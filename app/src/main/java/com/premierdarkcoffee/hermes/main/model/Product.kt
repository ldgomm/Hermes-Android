package com.premierdarkcoffee.hermes.main.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(var id: String,
                   var name: String,
                   var overview: List<Information>,
                   var price: Price,
                   var origin: String,
                   var offer: Offer,
                   var images: Images,
                   var stock: Int,
                   var colours: List<String>?,
                   var keywords: List<String>,
                   var category: String,
                   var subcategory: String)