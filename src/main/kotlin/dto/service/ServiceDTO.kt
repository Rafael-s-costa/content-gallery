package dto.service

import org.joda.time.DateTime

data class ServiceDTO (
    val id:             Integer,
    val name:           String,
    val description:    String,
    val cdate:          DateTime,
    val mdate:          DateTime
);