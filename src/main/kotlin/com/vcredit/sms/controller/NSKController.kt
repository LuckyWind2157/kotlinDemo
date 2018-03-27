package com.vcredit.sms.controller

import com.vcredit.sms.domain.ShortMessageInfo
import com.vcredit.sms.service.NSKService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @Autowired
    lateinit var nSKService: NSKService

    @GetMapping("/sms/{batchId}")
    fun queryUserById(@PathVariable batchId: String): List<ShortMessageInfo> {
        return nSKService.getListInfo(batchId)
    }
}

