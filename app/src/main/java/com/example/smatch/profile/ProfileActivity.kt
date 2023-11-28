package com.example.smatch.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smatch.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private var mBinding : ActivityProfileBinding ?= null
    private val binding : ActivityProfileBinding get() = requireNotNull(mBinding)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityProfileBinding.inflate(layoutInflater)
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