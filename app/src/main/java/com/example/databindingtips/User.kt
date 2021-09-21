package com.example.databindingtips

class User(val name : String, val year : Int) {
    private fun introduce() : String {
        return "I'm $name, $year years old."
    }
}