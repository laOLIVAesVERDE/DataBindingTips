package com.example.databindingtips

import java.util.*

object AppUtil {
    @JvmStatic
    fun convertToLocalTimeFormat(currentTime : String): String {
        return when (val language = Locale.getDefault().language) {
            "ja" -> "JP"
            else -> language
        }
    }
}