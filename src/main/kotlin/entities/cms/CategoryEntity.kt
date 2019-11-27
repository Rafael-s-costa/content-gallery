package entities.cms

import org.jetbrains.exposed.dao.IntIdTable

class CategoryEntity : IntIdTable("CATEGORY") {
    val name = varchar("name", 50)
    val description = varchar("description", 100)
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}