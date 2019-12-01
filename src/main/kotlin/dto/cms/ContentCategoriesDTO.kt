package dto.cms

import dto.BaseDTO
import org.joda.time.DateTime

data class ContentCategoriesDTO (
    val id:             Int,
    val contentId:      Int,
    val categoryId:     Int,
    val cdate:          DateTime?,
    val mdate:          DateTime?
): BaseDTO()