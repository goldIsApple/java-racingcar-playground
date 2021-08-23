package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    void 자동차_이름_길이_검증() throws Exception{
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Name("golddd"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Name(""));
    }

}
