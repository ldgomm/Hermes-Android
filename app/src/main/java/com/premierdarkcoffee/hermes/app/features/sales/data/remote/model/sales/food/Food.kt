package com.premierdarkcoffee.hermes.app.features.sales.data.remote.model.sales.food

import kotlinx.serialization.Serializable

@Serializable
data class Food(
    var flavors: List<String>? = null,
    var instructions: List<String>? = null,
    var minerals: Minerals? = null,
    var nutrients: Nutrients? = null,
    var precautions: List<String>? = null,
    var vitamins: Vitamins? = null
)

