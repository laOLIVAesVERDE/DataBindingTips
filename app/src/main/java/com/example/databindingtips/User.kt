package com.example.databindingtips

class User(val name : String, private val year : Int) {
    fun introduce() : String = "I'm $name, $year years old."
}