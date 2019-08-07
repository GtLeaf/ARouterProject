package com.mingdi.commonlib

import com.mingdi.commonlib.empty_service.EmptyAccountService
import com.mingdi.commonlib.service.IAccountService

class ServiceFactory private constructor() {

    lateinit var iAccountService:IAccountService

    companion object{
        val serviceFactory = Inner.serviceFactory
    }

    private object Inner {
        val serviceFactory = ServiceFactory()
    }
}

fun main(args: Array<String>){

}