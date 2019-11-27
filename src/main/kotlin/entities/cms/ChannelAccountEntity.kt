package entities.cms

import org.jetbrains.exposed.dao.IntIdTable

class ChannelAccountEntity : IntIdTable("CHANNEL_ACCOUNT") {
    val channelId = integer("channel_id")
    val accountId = integer("account_id")
    val followerTypeId = integer("follower_type_id")
    val cdate = datetime("cdate")
    val mdate = datetime("mdate")
}