package com.vcredit.sms.domain

import java.math.BigDecimal

data class ShortMessageInfo(var id: BigDecimal = BigDecimal(0), var phone: String?, val batchId: String, var msgContent: String?
)