package com.example.smatch.util

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class PopUpUtil(private val context: Context) {
    fun toast(s: String) {
        Toast.makeText(
            context, s, Toast.LENGTH_SHORT
        ).show()
    }

    fun snackbar(v: View, s: String) {
        Snackbar.make(
            v, s, Snackbar.LENGTH_SHORT
        ).show()
    }
}