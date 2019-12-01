package entities.cms

import org.jetbrains.exposed.sql.Table

object CategoryEntity : Table("CATEGORY") {
    val id          = integer("id").primaryKey().autoIncrement()
    val name        = varchar("name", 50)
    val description = varchar("description", 100).nullable()
    val serviceId   = integer("service_id")
    val cdate       = datetime("cdate").nullable()
    val mdate       = datetime("mdate").nullable()
}