package com.mingdi.commonlib.app

import android.app.Application

abstract class BaseApp : Application() {

    /*
    * appliction初始化
    * */
    abstract fun initModuleApp(application: Application)

    /**
     * 所有 Application 初始化后的自定义操作
     */
    abstract fun initModuleData(application: Application)
}