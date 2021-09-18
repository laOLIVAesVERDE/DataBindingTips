package com.example.databindingtips

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class MyCustomView : FrameLayout {
    constructor(context: Context) : super(context, null)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}