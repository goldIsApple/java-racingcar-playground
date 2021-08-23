package racing.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGeneratorTest {

    @Test
    void 랜덤_숫자_범위_1_10() {
        int randomNumber = NumberGenerator.createRandomNumber();
        Assertions.assertThat(randomNumber).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(10);
    }
}
