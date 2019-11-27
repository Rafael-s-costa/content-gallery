package entities.cms

import org.jetbrains.exposed.dao.IntIdTable

class ChannelEntity : IntIdTable("CHANNEL") {
    val name = varchar("name", 50)
    val description = varchar("description", 100)
    val serviceId = integer("service_id")
    val authorId = integer("author_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}