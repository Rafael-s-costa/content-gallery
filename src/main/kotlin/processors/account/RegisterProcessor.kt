package processors.account

import api.BaseResponse
import common.EnumErrorCode
import dao.account.AccountDAO
import processors.BaseProcessor

class RegisterProcessor : BaseProcessor {
    override suspend fun <K, V> process(request: Map<K, V>): BaseResponse {
        val result = AccountDAO.getAll()
        return BaseResponse(EnumErrorCode.SUCCESS.errorCode, "SUCCESS", result.toString())
    }
}