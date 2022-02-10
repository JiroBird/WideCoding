package com.github.jirobird.studingsample.maps

import java.lang.Error

sealed class Response {
    class Success(val timeValue:String)
    class Error(val err:java.lang.Error)
    object Waiting
}