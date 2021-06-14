import org.apache.camel.Exchange
import org.apache.camel.Processor

class FileProcessor : Processor {
    override fun process(exchange: Exchange?) {
        if (exchange != null) {
            val fileName = exchange.getIn().getHeader(Exchange.FILE_NAME, String)

            println(fileName)
        }
    }
}