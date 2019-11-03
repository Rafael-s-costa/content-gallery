import io.ktor.application.*
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.routing.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.jetty.Jetty
import resources.home

fun main(args: Array<String>) {
    embeddedServer(Jetty, port = 8080, module = Application::mainModule).start(wait = true)
}

fun Application.mainModule() {
    install(ContentNegotiation) {
        gson {}
    }
    install(Routing) {
        home();
    }
}