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
        val registerResult = RegisterProcessor().process();
        call.respond(registerResult)
    }
    post("/account/login") {
        LoginProcessor().process();
    }
    post("/account/delete") {
        DeleteAccountProcessor().process();
    }
    post("/account/validate-email") {
        ValidateEmailProcessor().process();
    }
    post("/account/change-password") {
        ChangePasswordProcessor().process();
    }
}