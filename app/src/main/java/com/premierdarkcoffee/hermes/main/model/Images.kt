package com.premierdarkcoffee.hermes.main.model

import kotlinx.serialization.Serializable

@Serializable
data class Images(var main: MainImages, var box: BoxImages?)

