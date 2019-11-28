package entities.request

import org.jetbrains.exposed.sql.Table

object RequestEntity : Table("REQUEST") {
    val id          = integer("id").primaryKey().autoIncrement()
    val requestType = varchar("request_type", 50)
    val errorCode   = integer("error_code")
    val payload     = varchar("payload", 250)
    val cdate       = datetime("cdate")
    val mdate       = datetime("mdate")
}