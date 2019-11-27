package entities.account

import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object AccountEntity : Table("ACCOUNT") {
    val id = integer("id").primaryKey().autoIncrement()
    val username = varchar("username", 50)
    val email = varchar("email", 100)
    val pwd = varchar("pwd", 250)
    val serviceId = integer("service_id")
    val followers = integer("followers")
    val rating = integer("rating")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}