package com.premierdarkcoffee.hermes.app.features.sales.data.remote.model.sales.food

import kotlinx.serialization.Serializable

@Serializable
data class Nutrients(var calories: Int? = null,
                     var totalFat: Tuple? = null,
                     var saturatedFat: Tuple? = null,
                     var transFat: Tuple? = null,
                     var cholesterol: Tuple? = null,
                     var sodium: Tuple? = null,
                     var totalCarbohydrate: Tuple? = null,
                     var dietaryFiber: Tuple? = null,
                     var totalSugars: Int? = null,
                     var addedSugars: Tuple? = null,
                     var protein: Tuple? = null)
