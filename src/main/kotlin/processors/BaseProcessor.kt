package processors

import api.BaseResponse

interface BaseProcessor {

    suspend fun <K,V> process(request: Map<K, V>) : BaseResponse
}