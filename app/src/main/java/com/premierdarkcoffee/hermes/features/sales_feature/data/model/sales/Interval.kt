package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Interval(var startTime: Long = 0, var endTime: Long = 0)