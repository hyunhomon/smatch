package com.example.smatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var mBinding : ActivityMainBinding ?= null
    private val binding : ActivityMainBinding get() = requireNotNull(mBinding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }
}