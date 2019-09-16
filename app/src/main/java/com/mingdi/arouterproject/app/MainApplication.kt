package com.mingdi.arouterproject.app

import android.app.Application
import com.mingdi.commonlib.AppConfig
import com.mingdi.commonlib.app.BaseApp

class MainApplication : BaseApp(){
    override fun initModuleApp(application: Application) {
        for (moduleApp in AppConfig.moduleApps) {
            try {
                val clazz = Class.forName(moduleApp)
                val baseApp = clazz.newInstance() as BaseApp
                baseApp.initModuleApp(this)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InstantiationException) {
                e.printStackTrace()
            }
        }
    }

    override fun initModuleData(application: Application) {
        for (moduleApp in AppConfig.moduleApps) {
            try {
                val clazz = Class.forName(moduleApp)
                val baseApp = clazz.newInstance() as BaseApp
                baseApp.initModuleData(this)
            } catch (e : ClassNotFoundException) {
                e.printStackTrace()
            } catch (e : IllegalAccessException) {
                e.printStackTrace()
            } catch (e : InstantiationException) {
                e.printStackTrace()
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        initModuleApp(this)
        initModuleData(this)
    }
}