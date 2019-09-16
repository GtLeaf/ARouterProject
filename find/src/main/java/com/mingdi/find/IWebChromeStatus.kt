package com.mingdi.find

import android.view.View
import android.webkit.WebChromeClient

interface IWebChromeStatus {
    fun onShowCustomView(view: View?, callback: WebChromeClient.CustomViewCallback?)

    fun onHideCustomView()
}