package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales.Interval
import kotlinx.serialization.Serializable

@Serializable
data class OfferTime(var timeInterval: Interval? = null, var day: Int? = null)
