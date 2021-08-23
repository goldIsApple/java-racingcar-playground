package racing.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racing.domain.Name;

public class NameTest {
    @Test
    void 이름_검증() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Name("name12"));
    }
}
