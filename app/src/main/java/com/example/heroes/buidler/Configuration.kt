package com.example.heroes.buidler

import android.graphics.Color

class Configuration(
    val latency: Int = 0,
    val userColor: Int = 0,
    val sensitivity: Int = 0
) {


    inner class Builder() {
        var latency: Int = 200
        var userColor: Int = Color.BLUE
        var sensitivity: Int = 0

        fun setLatency(value: Int): Builder {
            latency = value
            return this
        }

        fun setUserColor(value: Int): Builder {
            userColor = value
            return this
        }

        fun setSensitivity(value: Int): Builder {
            sensitivity = value
            return this
        }

        fun build(): Configuration = Configuration(
            latency = latency,
            userColor = userColor,
            sensitivity = sensitivity
        )
    }

}


