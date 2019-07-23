package com.mingdi.arouterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import kotlinx.android.synthetic.main.activity_target.*

@Route(path = "/app/target")
class TargetActivity : AppCompatActivity() {

    @Autowired
    var key = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        init()
    }

    private fun init() {
        tv_target_hello.text = key
    }
}
