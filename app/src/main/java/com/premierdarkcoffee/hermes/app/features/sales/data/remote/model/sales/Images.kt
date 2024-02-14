package com.premierdarkcoffee.hermes.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Images(var product: List<Photo>, var box: List<Photo>? = null)