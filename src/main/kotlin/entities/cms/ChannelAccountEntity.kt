package entities.cms

import org.jetbrains.exposed.sql.Table

object ChannelAccountEntity : Table("CHANNEL_ACCOUNT") {
    val id              = integer("id").primaryKey().autoIncrement()
    val channelId       = integer("channel_id")
    val accountId       = integer("account_id")
    val followerTypeId  = integer("follower_type_id")
    val cdate           = datetime("cdate").nullable()
    val mdate           = datetime("mdate").nullable()
}