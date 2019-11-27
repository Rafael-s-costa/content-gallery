package resources

import api.BaseResponse
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.util.toMap
import processors.account.*

fun Route.account() {
    post("/account/register") {
        val requestInfo = call.request.queryParameters.toMap();
        log.info("Received request for /Account/register with query params $requestInfo")
        val registerResult = RegisterProcessor().process(requestInfo);
        call.respond(registerResult)
    }
    post("/account/login") {
        val requestInfo = call.request.queryParameters.toMap();
        LoginProcessor().process(requestInfo);
    }
    post("/account/delete") {
        val requestInfo = call.request.queryParameters.toMap();
        DeleteAccountProcessor().process(requestInfo);
    }
    post("/account/validate-email") {
        val requestInfo = call.request.queryParameters.toMap();
        ValidateEmailProcessor().process(requestInfo);
    }
    post("/account/change-password") {
        val requestInfo = call.request.queryParameters.toMap();
        ChangePasswordProcessor().process(requestInfo);
    }
}