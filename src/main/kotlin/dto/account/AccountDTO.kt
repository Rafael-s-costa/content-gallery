package dto.account

import org.joda.time.DateTime

data class AccountDTO (
    val id:         Integer,
    val username:   String,
    val email:      String,
    val pwd:        String,
    val service_id: Integer,
    val followers:  Integer,
    val cdate:      DateTime,
    val mdate:      DateTime?
)