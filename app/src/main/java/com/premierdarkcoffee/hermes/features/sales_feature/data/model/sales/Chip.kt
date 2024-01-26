package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Chip(var alias: String, var cpu: CPU? = null, var gpu: GPU? = null)