package com.example.heroes.buidler

import android.graphics.Color

data class Configuration(
    val latency: Int,
    val userColor: Int,
    val sensitivity: Int
)

class  ConfigurationBuilder(){
    var latency : Int= 200
    var userColor: Int = Color.BLUE
    var sensitivity : Int = 0

    fun setLatency(value: Int): ConfigurationBuilder{
        latency = value
        return this
    }
    fun setUserColor(value: Int): ConfigurationBuilder{
        userColor = value
        return this
    }
    fun setSensitivity(value: Int): ConfigurationBuilder{
        sensitivity = value
        return this
    }

    fun build(): Configuration = Configuration(
        latency = latency,
        userColor = userColor,
        sensitivity = sensitivity
    )
}
