package com.example.databindingtips

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import com.example.databindingtips.databinding.MyCustomViewBinding

class MyCustomView : FrameLayout {
    constructor(context: Context) : super(context, null) { initView() }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) { initView() }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) { initView() }

    private lateinit var binding: MyCustomViewBinding

    private fun initView() {
        val layoutInflater = LayoutInflater.from(context)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.my_custom_view, this, false)
    }

    fun setUser(user : User) {
        binding.user = user
    }
}