package com.example.heroes.singleton

import com.example.heroes.buidler.Configuration
import com.example.heroes.buidler.ConfigurationBuilder

class Singleton private constructor() {

    private object HOLDER {
        val INSTANCE = Singleton()
    }

    companion object {
        val instance: Singleton by lazy { HOLDER.INSTANCE }
    }

    fun getHaracter(): String{
        val configuration: Configuration = ConfigurationBuilder()
            .setLatency(400)
            .setSensitivity(9)
            .setUserColor(50)
            .build()
        return "${configuration.latency} \n ${configuration.sensitivity} \n  ${configuration.userColor}"
    }
}