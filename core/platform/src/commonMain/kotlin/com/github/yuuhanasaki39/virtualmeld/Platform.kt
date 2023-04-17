package com.github.yuuhanasaki39.virtualmeld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform