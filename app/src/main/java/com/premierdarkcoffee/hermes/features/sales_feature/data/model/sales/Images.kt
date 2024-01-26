package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Images(var product: Photo, var box: Photo? = null)