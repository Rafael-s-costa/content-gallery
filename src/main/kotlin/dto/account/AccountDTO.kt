package dto.account

import org.joda.time.DateTime

data class AccountDTO (
    val id:         Int,
    val username:   String,
    val email:      String,
    val pwd:        String,
    val service_id: Int,
    val followers:  Int,
    val cdate:      DateTime,
    val mdate:      DateTime?
)