package com.vcredit.sms.repository

import com.vcredit.sms.domain.ShortMessageInfo
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select


@Mapper
interface NSKMapper {


    @Insert(" insert into user (USER_NAME, PASSWORD, DELETED) values (#{username}, #{password}, #{deleted})")
    fun insertUser(bean: ShortMessageInfo): Int

    @Select("SELECT t.id,t.phone,t.batch_id as batchId,t.msg_content as msgContent FROM t_short_msg t WHERE t.batch_id=#{batchId}")
    fun getListInfo(batchId: String): List<ShortMessageInfo>
}

