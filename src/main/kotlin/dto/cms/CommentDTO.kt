package dto.cms

import org.joda.time.DateTime

data class CommentDTO (
    val id:         Int,
    val content_id: Int,
    val author_id:  Int,
    val comment:    String,
    val rating:     Int,
    val cdate:      DateTime,
    val mdate:      DateTime
);