package com.example.smatch.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smatch.databinding.ActivityChattingBinding

class ChattingActivity : AppCompatActivity() {
    private var mBinding : ActivityChattingBinding ?= null
    private val binding : ActivityChattingBinding get() = requireNotNull(mBinding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityChattingBinding.inflate(layoutInflater)
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