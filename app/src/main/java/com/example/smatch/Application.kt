package com.example.smatch

import android.app.Application
import com.example.smatch.util.Keyboard
import com.example.smatch.util.PopUp
import com.example.smatch.util.Preference

class Application : Application() {
    companion object {
        lateinit var keyboard: Keyboard
        lateinit var popup: PopUp
        lateinit var pref: Preference
    }

    override fun onCreate() {
        super.onCreate()

        keyboard = Keyboard()
        popup = PopUp(applicationContext)
        pref = Preference(applicationContext)
    }
}