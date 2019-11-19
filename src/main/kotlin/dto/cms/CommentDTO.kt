package dto.cms

import org.joda.time.DateTime

data class CommentDTO (
    val id:         Integer,
    val content_id: Integer,
    val author_id:  Integer,
    val comment:    String,
    val rating:     Integer,
    val cdate:      DateTime,
    val mdate:      DateTime
);