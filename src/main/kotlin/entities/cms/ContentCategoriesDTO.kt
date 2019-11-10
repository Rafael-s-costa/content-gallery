package entities.cms

import org.joda.time.DateTime

data class ContentCategoriesDTO (
    val id:             Integer,
    val content_id:     Integer,
    val category_id:    Integer,
    val cdate:          DateTime,
    val mdate:          DateTime
);