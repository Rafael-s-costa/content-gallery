package processors

import api.BaseResponse

interface BaseProcessor {

    fun <K,V> process(request: Map<K, V>) : BaseResponse
}