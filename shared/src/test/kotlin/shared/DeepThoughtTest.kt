package shared

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeepThoughtTest {

    @Test
    fun `meaning of life = 42`() {
        assertThat(DeepThought.compute()).isEqualTo(42)
    }

}
