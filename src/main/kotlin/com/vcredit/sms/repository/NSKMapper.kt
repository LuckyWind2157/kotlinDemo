package com.vcredit.sms.repository

import com.vcredit.sms.domain.MessageDto
import com.vcredit.sms.domain.ShortMessageInfo
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select


@Mapper
interface NSKMapper {


    @Insert(" INSERT INTO T_SEND_SMS_INFO (ID,MSG,RECEIVETELEPHONE) values(SEQ_T_SEND_SMS_INFO.NEXTVAL,#{msg},#{phone})")
    fun insertDto(@Param("msg") msg: String, @Param("phone") phone: String): Int

    @Select("SELECT t.id,t.phone,t.batch_id as batchId,t.msg_content as msgContent FROM t_short_msg t WHERE t.batch_id=#{batchId}")
    fun getListInfo(batchId: String): List<ShortMessageInfo>

    @Select("SELECT id,MSG,RECEIVETELEPHONE as phone FROM T_SEND_SMS_INFO ")
    fun getList(): List<MessageDto>
}

