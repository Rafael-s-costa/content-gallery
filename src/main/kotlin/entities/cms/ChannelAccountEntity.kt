package entities.cms

import entities.account.AccountEntity
import entities.account.AccountEntity.autoIncrement
import entities.account.AccountEntity.primaryKey
import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.Table

object ChannelAccountEntity : Table("CHANNEL_ACCOUNT") {
    val id = integer("id").primaryKey().autoIncrement()
    val channelId = integer("channel_id")
    val accountId = integer("account_id")
    val followerTypeId = integer("follower_type_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}