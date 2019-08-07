package com.mingdi.commonlib.empty_service

import com.mingdi.commonlib.service.IAccountService

class EmptyAccountService : IAccountService {

    override fun isLogin(): Boolean {
        return false
    }

    override fun getAccountService(): String {
        return ""
    }
}