import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class KotlinMainTest {

    @Test
    fun test() {
        Assertions.assertThat("asd").isBase64
    }
}