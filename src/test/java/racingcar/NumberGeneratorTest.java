package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class NumberGeneratorTest {

    @RepeatedTest(10)
    void 숫자_1_9_난수_생성() {
        int number = NumberGenerator.generate();
        Assertions.assertThat(number).isGreaterThanOrEqualTo(1).isLessThanOrEqualTo(9);
    }
}
