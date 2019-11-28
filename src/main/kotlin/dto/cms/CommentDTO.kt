package dto.cms

import org.joda.time.DateTime

data class CommentDTO (
    val id:         Int,
    val contentId:  Int,
    val authorId:   Int,
    val comment:    String,
    val rating:     Int,
    val cdate:      DateTime,
    val mdate:      DateTime
);