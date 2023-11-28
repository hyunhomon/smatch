package com.example.smatch.util

import android.content.Context

class PreferenceUtil(context: Context) {
    private val prefs = context.getSharedPreferences("pref", Context.MODE_PRIVATE)

    fun getBoolean(key: String, defValue: Boolean): Boolean {
        return prefs.getBoolean(key, defValue)
    }

    fun setBoolean(key: String, boolean: Boolean) {
        prefs.edit().putBoolean(key, boolean).apply()
    }

    fun getInt(key: String, defValue: Int): Int {
        return prefs.getInt(key, defValue)
    }

    fun setInt(key: String, int: Int) {
        prefs.edit().putInt(key, int).apply()
    }

    fun getString(key: String, defValue: String): String? {
        return prefs.getString(key, defValue)
    }

    fun setString(key: String, string: String) {
        prefs.edit().putString(key, string).apply()
    }
}