package entities.cms

import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object ContentCategoriesEntity : Table("CONTENT_CATEGORY") {
    val id = integer("id").primaryKey().autoIncrement()
    val categoryId = integer("category_id")
    val contentId = integer("content_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}