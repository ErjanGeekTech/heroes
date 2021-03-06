package com.example.heroes.singleton

import com.example.heroes.buidler.Configuration

object Singleton {

    fun getHaracter(): String {
        val configuration: Configuration = Configuration().Builder()
            .build()
        return "${configuration.latency} \n ${configuration.sensitivity} \n  ${configuration.userColor}"
    }
}