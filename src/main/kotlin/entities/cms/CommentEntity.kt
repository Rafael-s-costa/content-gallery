package entities.cms

import org.jetbrains.exposed.dao.IntIdTable

class CommentEntity : IntIdTable("COMMENT") {
    val contentId = integer("content_id")
    val authorId = integer("author_id")
    val comment = varchar("comment", 255)
    val rating = integer("rating")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}