package com.example.databindingtips

import java.text.SimpleDateFormat
import java.util.*

object AppUtil {
    @JvmStatic
    fun convertToLocalTimeFormat(currentTime : String): String {
        val format = when (val language = Locale.getDefault().language) {
            "ja" -> SimpleDateFormat("yyyy年MM月dd日HH時mm分", Locale.getDefault())
            else -> SimpleDateFormat("M/DD/yyyy HH:mm", Locale.getDefault())
        }
        val date = Date()
    }
}