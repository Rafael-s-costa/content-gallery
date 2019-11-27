package entities.cms

import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object ContentEntity : Table("CONTENT") {
    val id = integer("id").primaryKey().autoIncrement()
    val title = varchar("title", 250)
    val url = varchar("url", 250)
    val rating = integer("rating")
    val authorId = integer("author_id")
    val serviceId = integer("service_id")
    val channelId = integer("channel_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}