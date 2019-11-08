package resources

import api.BaseResponse
import common.getLogger
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.home() {
    get("/") {
        val response = BaseResponse(1000, "SUCCESS", "Hello");
        getLogger().info("Received request for / ")
        call.respond(response)
    }
}