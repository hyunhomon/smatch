package com.example.smatch

import android.app.Application
import com.example.smatch.util.KeyboardUtil
import com.example.smatch.util.PopUpUtil
import com.example.smatch.util.PreferenceUtil

class Application : Application() {
    companion object {
        lateinit var kbUtil : KeyboardUtil
        lateinit var popupUtil : PopUpUtil
        lateinit var prefUtil: PreferenceUtil
    }

    override fun onCreate() {
        super.onCreate()

        kbUtil = KeyboardUtil()
        popupUtil = PopUpUtil(applicationContext)
        prefUtil = PreferenceUtil(applicationContext)
    }
}