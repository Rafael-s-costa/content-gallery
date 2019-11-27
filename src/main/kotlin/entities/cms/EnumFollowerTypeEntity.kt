package entities.cms

import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object EnumFollowerTypeEntity : Table("ENUM_FOLLOWER_TYPE") {
    val id = integer("id").primaryKey().autoIncrement()
    val followerType = varchar("follower_type", 20)
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}