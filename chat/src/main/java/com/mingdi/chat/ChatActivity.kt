package com.mingdi.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_chat.*

@Route(path = "/chat/test")
class ChatActivity : AppCompatActivity() {

    @JvmField
    @Autowired
    var key2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        ARouter.getInstance().inject(this)
        tv_chat_hello.text = key2
    }
}
