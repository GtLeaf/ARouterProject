package com.mingdi.arouterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = "/app/main")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ARouter.getInstance().inject(this)
        init()
        setListener()
    }

    private fun init() {}

    private fun setListener() {
        btn_go_home.setOnClickListener {
            ARouter.getInstance().build(ARouterConstants.APP_TARGET)
                    .withString("key", et_params.text.toString())
                    .navigation()
        }

        btn_go_chat.setOnClickListener {
            //跳转并携带参数
            ARouter.getInstance().build("/chat/test")//目标页面
                    .withLong("key1", 123L)
                    .withString("key2", et_params.text.toString())
                    .navigation()
        }
    }
}
