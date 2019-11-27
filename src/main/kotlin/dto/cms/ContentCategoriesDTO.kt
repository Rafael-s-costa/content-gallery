package dto.cms

import org.joda.time.DateTime

data class ContentCategoriesDTO (
    val id:             Int,
    val content_id:     Int,
    val category_id:    Int,
    val cdate:          DateTime,
    val mdate:          DateTime
);