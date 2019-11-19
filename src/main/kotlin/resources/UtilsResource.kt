package resources

import api.BaseResponse
import common.getLogger
import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import processors.account.RegisterProcessor
import javax.annotation.processing.AbstractProcessor

val log = getLogger();

fun Route.home() {
    get("/") {
        val requestInfo = call.request.queryParameters;
        log.info("Received request for / with query params$requestInfo")
        val response = BaseResponse(1000, "SUCCESS", "Hello");
        call.respond(response)
    }
    get("/ping") {
        log.info("Received Ping Request");
        call.respond("PONG");
    }
}

/*
Trying to make a abstract resource object
fun <T, K> executeResource(obj: T, call: ApplicationCall) {
    val log = getLogger();
    val requestInfo = call.request.queryParameters;
    resources.log.info("Received request for / with query params$requestInfo")

    val processorResult = AbstractProcessor(obj).process();

    val response = BaseResponse(1000, "SUCCESS", "Hello");
    call.respond(response)
}
 */