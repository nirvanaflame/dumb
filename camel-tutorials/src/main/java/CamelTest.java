import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.lw.LightweightCamelContext;

public class CamelTest {


  public static void main(String[] args) throws Exception {
    CamelContext context = new LightweightCamelContext();

    context.addRoutes(new RouteBuilder() {
      @Override
      public void configure() throws Exception {

      }
    });
  }
}
