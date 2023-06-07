package com.ronakj.weatherapp.models

import java.io.Serializable

data class Wind(
    val speed: Double,
    val deg: Int
) : Serializable