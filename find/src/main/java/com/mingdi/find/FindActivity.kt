package com.mingdi.find

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebChromeClient
import kotlinx.android.synthetic.main.activity_find.*
import android.webkit.WebSettings




class FindActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find)

        init()
    }

    private fun initWebView(){
        val settings = wv_video_full_screen.settings

        settings.javaScriptEnabled = true
        settings.javaScriptCanOpenWindowsAutomatically = true
        settings.pluginState = WebSettings.PluginState.ON
        //settings.setPluginsEnabled(true);
        settings.allowFileAccess = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        settings.cacheMode = WebSettings.LOAD_NO_CACHE
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        //javascriptInterface = new JavascriptInterface();
        //mWebView.addJavascriptInterface(javascriptInterface, "java2js_laole918");

        wv_video_full_screen.webChromeClient = object : WebChromeClient(){
            override fun onShowCustomView(view: View?, callback: CustomViewCallback?) {
                Log.d("full screen", "onShowCustomView")
                super.onShowCustomView(view, callback)
            }

            override fun onHideCustomView() {
                Log.d("full screen", "onHideCustomView")
                super.onHideCustomView()
            }
        }
    }

    private fun init(){
//        initWebView()
//        wv_video_full_screen.loadUrl("https://sf1-ttcdn-tos.pstatp.com/obj/ad-vangogh/android-video-test.html")
//        wv_video_full_screen.loadUrl("https://www.baidu.com")
    }

}
