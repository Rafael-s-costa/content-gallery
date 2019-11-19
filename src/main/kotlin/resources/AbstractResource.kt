package resources

import io.ktor.routing.Route
import io.ktor.routing.get

abstract class AbstractResource : BaseResource {
    fun Route.abstract() {
        get("/") {

        }
    }
}
