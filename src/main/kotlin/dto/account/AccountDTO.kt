package dto.account

import org.joda.time.DateTime

data class AccountDTO (
    val id:         Int,
    val username:   String,
    val email:      String,
    val pwd:        String,
    val serviceId:  Int,
    val followers:  Int,
    val rating :    Int,
    val cdate:      DateTime,
    val mdate:      DateTime
)