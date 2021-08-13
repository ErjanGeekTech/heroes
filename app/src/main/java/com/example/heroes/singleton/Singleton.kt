package com.example.heroes.singleton

import com.example.heroes.buidler.Configuration

object Singleton {

    fun getHaracter(): String{
        val configuration: Configuration = Configuration(0, 0, 0).Builder()
//            .setLatency(400)
//            .setSensitivity(9)
//            .setUserColor(50)
            .build()

        return "${configuration.latency} \n ${configuration.sensitivity} \n  ${configuration.userColor}"
    }
}