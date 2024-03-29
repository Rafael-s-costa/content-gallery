package dto.request

import dto.BaseDTO
import org.joda.time.DateTime

data class RequestDTO (
    val id:             Int,
    val requestType:    String,
    val errorCode:      Int,
    val payload:        String?,
    val cdate:          DateTime?,
    val mdate:          DateTime?
): BaseDTO()