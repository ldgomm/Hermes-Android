package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Warranty(var hasWarranty: Boolean, var months: Int? = null)