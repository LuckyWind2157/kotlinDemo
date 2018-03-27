package com.vcredit.sms.domain

import java.math.BigDecimal

data class MessageDto(var id: BigDecimal = BigDecimal(0), var msg: String?, var receiveTelephone: String?)



