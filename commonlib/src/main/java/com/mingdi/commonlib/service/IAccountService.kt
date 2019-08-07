package com.mingdi.commonlib.service

interface IAccountService {

    /*
    * 是否已经登录
    * */
    fun isLogin():Boolean

    /*
    * 获取登录用户的user_id
    * */
    fun getAccountService():String
}