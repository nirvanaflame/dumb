import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.lw.LightweightCamelContext;

public class Main {

  public static void main(String[] args) throws Exception {
    try (CamelContext context = new LightweightCamelContext()) {

      context.addRoutes(new RouteBuilder() {
        @Override
        public void configure() throws Exception {
          from("")
              .log("was it called?")
              .to("");
        }
      });
    }
  }
}
