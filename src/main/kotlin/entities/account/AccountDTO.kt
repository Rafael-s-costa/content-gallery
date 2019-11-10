package entities.account

import org.joda.time.DateTime

data class AccountDTO (
    val id: Integer,
    val username: String,
    val pwd: String,
    val cdate: DateTime,
    val mdate: DateTime?
)