package com.mingdi.login.service

import android.app.Application
import com.mingdi.commonlib.ServiceFactory
import com.mingdi.commonlib.app.BaseApp

class LoginApp : BaseApp() {

    override fun initModuleApp(application: Application) {
        ServiceFactory.serviceFactory.iAccountService = AccountService()
    }

    override fun initModuleData(application: Application) {
    }

    override fun onCreate() {
        super.onCreate()
        initModuleApp(this)
        initModuleData(this)
    }
}