package entities.service

import org.jetbrains.exposed.dao.IntIdTable

class ServiceEntity : IntIdTable("SERVICE") {
    val name = varchar("name", 50)
    val description = varchar("description", 50)
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}
