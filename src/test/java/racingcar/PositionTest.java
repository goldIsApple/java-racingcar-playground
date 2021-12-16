package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionTest {

	@Test
	void 생성() {
		Position position = new Position(1);
		assertThat(position).isEqualTo(new Position(1));
	}

	@Test
	@DisplayName("랜덤값이 4 이상일 경우 전진")
	void 이동() {
		Position position = new Position();
		assertThat(position.move(4)).isEqualTo(new Position(1));
		assertThat(position.move(3)).isEqualTo(new Position());
	}

	@Test
	@DisplayName("랜덤값은 0에서 9사이 여야 한다.")
	void 랜덤값_검증() {
		Position position = new Position();
		assertThatThrownBy(()->position.move(-1))
			.isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(()->position.move(10))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
