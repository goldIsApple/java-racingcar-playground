package racing.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import racing.domain.Position;

public class PositionTest {

    @Test
    void 포지션_생성() {
        Position position = new Position(1);
        org.assertj.core.api.Assertions.assertThat(position).isEqualTo(new Position(1));
    }

    @Test
    void 포지션_검증() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Position(-1));
    }

    @Test
    void 포지션_이동() {
        Position position = new Position();
        Position movePosition = position.move();
        org.assertj.core.api.Assertions.assertThat(movePosition).isEqualTo(new Position(1));
    }
}
