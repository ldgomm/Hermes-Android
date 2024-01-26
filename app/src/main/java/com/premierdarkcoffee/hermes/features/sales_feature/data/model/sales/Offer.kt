package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Offer(var isActive: Boolean = false, var discountPercentage: Int? = null, var time: OfferTime? = null)
