package entities.cms

import org.jetbrains.exposed.dao.IntIdTable

class EnumFollowerTypeEntity : IntIdTable("ENUM_FOLLOWER_TYPE") {
    val followerType = varchar("follower_type", 20)
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}