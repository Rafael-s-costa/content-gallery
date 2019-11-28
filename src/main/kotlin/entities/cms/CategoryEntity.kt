package entities.cms

import org.jetbrains.exposed.sql.Table

object CategoryEntity : Table("CATEGORY") {
    val id          = integer("id").primaryKey().autoIncrement()
    val name        = varchar("name", 50)
    val description = varchar("description", 100)
    val serviceId   = integer("service_id")
    val cdate       = datetime("cdate")
    val mdate       = datetime("mdate")
}