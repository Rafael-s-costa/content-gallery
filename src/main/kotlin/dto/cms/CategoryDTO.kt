package dto.cms

import org.joda.time.DateTime

data class CategoryDTO (
    val id:             Integer,
    val name:           String,
    val description:    String,
    val service_id:     Integer,
    val cdate:          DateTime,
    val mdate:          DateTime
);