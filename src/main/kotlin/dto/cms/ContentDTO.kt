package dto.cms

data class ContentDTO (
    val id:         Int,
    val title:      String,
    val url:        String,
    val rating:     Int,
    val author_id:  Int,
    val service_id: Int,
    val channel_id: Int
);