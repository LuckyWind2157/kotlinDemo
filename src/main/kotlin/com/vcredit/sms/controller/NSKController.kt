package com.vcredit.sms.controller

import com.vcredit.sms.domain.MessageDto
import com.vcredit.sms.domain.ShortMessageInfo
import com.vcredit.sms.service.NSKService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {
    @Autowired
    lateinit var nSKService: NSKService

    @GetMapping("/sms/{batchId}")
    fun queryUserById(@PathVariable batchId: String): List<ShortMessageInfo> {
        return nSKService.getListInfo(batchId)
    }

    @PostMapping("/sms/send")
    fun sendMessage(@RequestParam("msg") msg: String, @RequestParam("receiveTelephone") phone: String): String {
        return if (nSKService.insertMessage(msg, phone) > 0) "0,true" else "null"
    }

    @GetMapping("/sms/getList")
    fun getList(): List<MessageDto> {
        return nSKService.getListInfo()
    }
}

