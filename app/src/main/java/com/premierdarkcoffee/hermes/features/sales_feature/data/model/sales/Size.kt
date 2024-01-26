package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Size(val width: Double, val height: Double, val deep: Double? = null, val unit: String)