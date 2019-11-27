package entities.request

import org.jetbrains.exposed.dao.IntIdTable

class RequestEntity : IntIdTable("REQUEST") {
    val requestType = varchar("request_type", 50)
    val errorCode = integer("error_code")
    val payload = varchar("payload", 250)
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}