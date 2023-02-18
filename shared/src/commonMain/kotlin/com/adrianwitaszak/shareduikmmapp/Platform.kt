package com.adrianwitaszak.shareduikmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform