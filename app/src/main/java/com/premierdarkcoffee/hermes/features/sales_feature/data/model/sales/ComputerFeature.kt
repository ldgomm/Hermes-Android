package com.premierdarkcoffee.hermes.features.sales_feature.data.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class ComputerFeature(var accessibility: List<String>? = null,
                           var authentication: List<String>? = null,
                           var builtInApps: List<String>? = null,
                           var calling: Calling? = null,
                           var carriers: List<String>? = null,
                           var chip: Chip? = null,
                           var connectivity: Connectivity? = null,
                           var location: List<String>? = null,
                           var os: String? = null,
                           var paymentMethod: String? = null,
                           var ram: List<String>? = null,
                           var safety: List<String>? = null,
                           var simCard: List<String>? = null)