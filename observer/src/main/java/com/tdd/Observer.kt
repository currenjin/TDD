package com.tdd

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}