package calculator;

import java.util.Arrays;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    void 숫자_합_검증() {
        Assertions.assertThat(new Numbers(Arrays.asList(1, 2, 3)).getTotal()).isEqualTo(6);
        Assertions.assertThat(new Numbers(Arrays.asList()).getTotal()).isEqualTo(0);
    }
}
