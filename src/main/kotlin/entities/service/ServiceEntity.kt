package entities.service

import org.jetbrains.exposed.dao.IntIdTable

class ServiceEntity : IntIdTable("SERVICE"){
    val name = varchar("name", 50)
    val director = varchar("director", 50)
}