package dto.cms

import org.joda.time.DateTime

data class ContentDTO (
    val id:         Int,
    val title:      String,
    val url:        String,
    val rating:     Int,
    val authorId:   Int,
    val serviceId:  Int,
    val channelId:  Int,
    val cdate:      DateTime,
    val mdate:      DateTime
);