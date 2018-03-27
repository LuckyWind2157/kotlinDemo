package com.vcredit.sms.service

import com.vcredit.sms.domain.ShortMessageInfo

interface NSKService {

    fun insertMessage(bean: ShortMessageInfo): Int
    fun getListInfo(batchId: String): List<ShortMessageInfo>
}