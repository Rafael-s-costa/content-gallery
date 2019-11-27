package processors.account

import api.BaseResponse
import common.EnumErrorCode
import dao.BaseDAO
import dao.account.AccountDAO
import db.DatabaseFactory.dbQuery
import entities.service.ServiceEntity
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import processors.BaseProcessor

class RegisterProcessor : BaseProcessor {
    override suspend fun <K, V> process(request: Map<K, V>): BaseResponse {
        val result = AccountDAO.getAll()
        return BaseResponse(EnumErrorCode.SUCCESS.errorCode, "SUCCESS", result.toString())
    }
}