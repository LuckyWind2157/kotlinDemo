package com.vcredit.sms.service.impl

import com.vcredit.sms.domain.MessageDto
import com.vcredit.sms.domain.ShortMessageInfo
import com.vcredit.sms.repository.NSKMapper
import com.vcredit.sms.service.NSKService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NSKServiceImpl : NSKService {


    @Autowired
    lateinit var nSKMapper: NSKMapper

    override fun insertMessage(msg: String, phone: String): Int {
        return nSKMapper.insertDto(msg, phone)
    }

    override fun getListInfo(batchId: String): List<ShortMessageInfo> {
        return nSKMapper.getListInfo(batchId)
    }

    override fun getListInfo(): List<MessageDto> {
        return nSKMapper.getList()
    }
}
