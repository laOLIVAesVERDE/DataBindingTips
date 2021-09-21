package com.example.databindingtips

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class MyCustomView : FrameLayout {
    constructor(context: Context) : super(context, null) { initView() }
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) { initView() }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) { initView() }

    private fun initView() {
        inflate(context, R.layout.my_custom_view, this);
    }
}