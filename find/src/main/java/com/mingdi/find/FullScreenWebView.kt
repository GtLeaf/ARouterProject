package com.mingdi.find

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class FullScreenWebView(
        context: Context,
        attr: AttributeSet? = null,
        defStyleAttr: Int = 0)
    : FrameLayout(context, attr, defStyleAttr) {

    init {
        initWebView()
    }

    private fun initWebView() {

    }

}