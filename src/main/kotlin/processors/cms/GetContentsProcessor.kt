package processors.cms

import api.BaseResponse
import processors.BaseProcessor

class GetContentsProcessor : BaseProcessor {
    override suspend fun <K, V> process(request: Map<K, V>): BaseResponse {
        TODO("not implemented")
    }
}