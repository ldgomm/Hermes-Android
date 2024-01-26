package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
class Display(var technology: String,
              var diagonal: String? = null,
              var updateFrequency: Int? = null,
              var glow: Int? = null,
              var isTouch: Boolean? = null,
              var resolution: String? = null,
              var features: List<String>? = null,
              var extraFeatures: List<String>? = null)