package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Connectivity(var ports: List<String>, var cellular: List<String>? = null, var wireless: List<String>? = null)
