package dto.cms

import org.joda.time.DateTime

data class ChannelDTO (
    val id:             Integer,
    val name:           String,
    val description:    String,
    val followers:      Integer,
    val cdate:          DateTime,
    val mdate:          DateTime
);