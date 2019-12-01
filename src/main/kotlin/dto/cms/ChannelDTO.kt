package dto.cms

import dto.BaseDTO
import org.joda.time.DateTime

data class ChannelDTO (
    val id:             Int,
    val name:           String,
    val description:    String?,
    val serviceId:      Int,
    val authorId:       Int,
    val cdate:          DateTime?,
    val mdate:          DateTime?
): BaseDTO()