package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class GPU(var alias: String,
               var cores: Int? = null,
               var displayConnectors: List<String>? = null,
               var compatibilityWithSpecificTechnologies: List<String>? = null,
               var coolingDesign: String? = null,
               var supportForMultiMonitor: Boolean? = null)