package entities.service

import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object ServiceEntity : Table("SERVICE") {
    val id              = integer("id").primaryKey().autoIncrement()
    val name            = varchar("name", 50)
    val description     = varchar("description", 50)
    val cdate           = datetime("cdate")
    val mdate           = datetime("mdate")
}
