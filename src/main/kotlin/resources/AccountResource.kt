package resources

import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import processors.account.*

fun Route.account() {
    post("/account/register") {
        RegisterProcessor().process();
    }
    get("/account/login") {
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