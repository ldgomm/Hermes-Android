package com.premierdarkcoffee.hermes.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Control(var externalButtons: List<String>? = null)

