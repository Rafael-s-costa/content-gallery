package entities.cms

import org.jetbrains.exposed.sql.Table

object CommentEntity : Table("COMMENT") {
    val id          = integer("id").primaryKey().autoIncrement()
    val contentId   = integer("content_id")
    val authorId    = integer("author_id")
    val comment     = varchar("comment", 255)
    val rating      = integer("rating")
    val cdate       = datetime("cdate").nullable()
    val mdate       = datetime("mdate").nullable()
}