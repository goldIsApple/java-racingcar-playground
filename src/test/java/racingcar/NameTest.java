package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {

	@Test
	void 생성() {
		String carName = "람보르기니";
		Name name = new Name(carName);
		assertThat(name).isEqualTo(new Name(carName));
	}

	@Test
	@DisplayName("자동차 이름은 5글자를 초과 할수 없다.")
	void 자동차_이름_5_초과() {
		String carName = "람보르기이니";
		assertThatThrownBy(() -> new Name(carName))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining(carName);
	}
	@Test
	@DisplayName("자동차 이름이 공백이거나 null 일때")
	void 자동차_이름_5_공백_null() {
		assertThatThrownBy(() -> new Name(null))
			.isInstanceOf(IllegalArgumentException.class);

		assertThatThrownBy(() -> new Name(""))
			.isInstanceOf(IllegalArgumentException.class);
	}
	
}
