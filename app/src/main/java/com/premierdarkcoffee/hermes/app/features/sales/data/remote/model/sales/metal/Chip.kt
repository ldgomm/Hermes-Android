package com.premierdarkcoffee.hermes.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Chip(var alias: String, var cpu: CPU? = null, var gpu: GPU? = null)