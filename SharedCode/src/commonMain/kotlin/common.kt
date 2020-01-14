package com.movies.mobile

expect fun platformName(): String

fun createApplicationMessage(): String = "Kotlin Rocks on ${platformName()}"