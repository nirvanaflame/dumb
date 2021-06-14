import org.apache.camel.builder.RouteBuilder
import java.nio.file.Path

class FileRouter : RouteBuilder() {
    private val basePath = "C:/Users/Siarhei_Putsik/IdeaProjects/playground-parent/camel-tutorials/"
    private val testResourcePath = "src/test/resources/"

    override fun configure() {
        val fPath = Path.of(basePath, testResourcePath, "a", "test.md")
        val tPath = Path.of(basePath, testResourcePath, "b", "test.md")

        println(fPath.toString())

        from(fPath.toString())
                .process(FileProcessor()) to tPath.toString()
    }
}