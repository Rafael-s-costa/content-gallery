package entities.cms

import entities.account.AccountEntity
import entities.account.AccountEntity.autoIncrement
import entities.account.AccountEntity.primaryKey
import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object CategoryEntity : Table("CATEGORY") {
    val id = integer("id").primaryKey().autoIncrement()
    val name = varchar("name", 50)
    val description = varchar("description", 100)
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}