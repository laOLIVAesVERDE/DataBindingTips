package com.example.databindingtips

import java.text.SimpleDateFormat
import java.util.*

object AppUtil {
    @JvmStatic
    fun convertToLocalTimeFormat(): String {
        val format = when (Locale.getDefault().language) {
            "ja" -> SimpleDateFormat("yyyy年M月d日 HH時mm分", Locale.getDefault())
            else -> SimpleDateFormat("M/d/yyyy HH:mm", Locale.getDefault())
        }
        val date = Date(System.currentTimeMillis())
        return format.format(date)
    }
}