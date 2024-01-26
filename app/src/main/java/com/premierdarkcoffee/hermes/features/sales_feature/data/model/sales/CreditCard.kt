package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class CreditCard(var card: Double, var withinterest: Int? = null, var withoutinterest: Int? = null)