package entities.account

import org.jetbrains.exposed.dao.IntIdTable

class AccountEntity : IntIdTable("account.ACCOUNT") {
    val username = varchar("username", 50)
    val email = varchar("email", 100)
    val pwd = varchar("pwd", 250)
    val serviceId = integer("service_id")
    val followers = integer("followers")
    val rating = integer("rating")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}