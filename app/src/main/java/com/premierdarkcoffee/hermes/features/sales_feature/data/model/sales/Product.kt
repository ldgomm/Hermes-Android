package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Product(var id: String,
                   var codes: Codes? = null,
                   var images: Images,
                   var name: String,
                   var overview: List<Information>,
                   var specifications: Specifications? = null,
                   var offer: Offer,
                   var origin: String,
                   var price: Price,
                   var stock: Int,
                   var category: Category,
                   var keywords: List<String>,
                   var warranty: Warranty? = null,
                   var legal: String? = null,
                   var warning: String? = null)



