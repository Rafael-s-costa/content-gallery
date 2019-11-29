package dto.cms

import dto.BaseDTO
import org.joda.time.DateTime

data class ChannelAccountDTO (
    val id:                 Int,
    val channelId:          Int,
    val accountId:          Int,
    val followerTypeId:     Int,
    val cdate:              DateTime,
    val mdate:              DateTime
): BaseDTO()
