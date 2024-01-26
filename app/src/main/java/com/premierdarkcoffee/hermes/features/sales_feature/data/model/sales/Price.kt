package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales.CreditCard
import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var affiliate: Double? = null, var creditCard: CreditCard? = null)

