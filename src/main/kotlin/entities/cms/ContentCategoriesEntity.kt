package entities.cms

import org.jetbrains.exposed.dao.IntIdTable

class ContentCategoriesEntity : IntIdTable("CONTENT_CATEGORY") {
    val categoryId = integer("category_id")
    val contentId = integer("content_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}