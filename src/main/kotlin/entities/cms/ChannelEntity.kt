package entities.cms

import entities.account.AccountEntity
import entities.account.AccountEntity.autoIncrement
import entities.account.AccountEntity.primaryKey
import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object ChannelEntity : Table("CHANNEL") {
    val id = integer("id").primaryKey().autoIncrement()
    val name = varchar("name", 50)
    val description = varchar("description", 100)
    val serviceId = integer("service_id")
    val authorId = integer("author_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}