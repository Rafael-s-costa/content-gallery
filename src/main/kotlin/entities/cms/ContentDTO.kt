package entities.cms

data class ContentDTO (
    val id:         Integer,
    val title:      String,
    val url:        String,
    val rating:     Integer,
    val author_id:  Integer,
    val service_id: Integer,
    val channel_id: Integer
);