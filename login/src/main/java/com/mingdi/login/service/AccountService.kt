package com.mingdi.login.service

import com.mingdi.commonlib.service.IAccountService

class AccountService : IAccountService {
    override fun isLogin(): Boolean {
        return true
    }

    override fun getAccountService(): String {
        return "user_id"
    }
}