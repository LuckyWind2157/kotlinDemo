package com.vcredit.sms.service

import com.vcredit.sms.domain.MessageDto
import com.vcredit.sms.domain.ShortMessageInfo

interface NSKService {

    fun insertMessage(msg: String, phone: String): Int
    fun getListInfo(batchId: String): List<ShortMessageInfo>
    fun getListInfo(): List<MessageDto>
}