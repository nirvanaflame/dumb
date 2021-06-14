import org.apache.camel.CamelContext
import org.apache.camel.impl.lw.LightweightCamelContext

fun main() {
    val context: CamelContext = LightweightCamelContext()

    val route = FileRouter()

    println(route.toString())

    context.addRoutes(route)

    context.start()

    println(context.routes.size)
    context.stop()
}
