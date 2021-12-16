package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	@DisplayName("이동 을 가장 많이 포지션")
	void 포지션_최대_이동() {
		List<Car> participants = Arrays.asList(
			new Car("1",0),
			new Car("2",1),
			new Car("3",3),
			new Car("4",3)
		);
		Cars cars = new Cars(participants);
		assertThat(cars.getMaxPosition()).isEqualTo(new Position(3));
	}

	@Test
	void 우승자() {
		Car car3 = new Car("3", 3);
		Car car4 = new Car("4", 3);
		List<Car> participants = Arrays.asList(
			new Car("1",0),
			new Car("2",1),
			car3,
			car4
		);
		Cars cars = new Cars(participants);
		List<Car> winners = cars.getWinners();

		assertThat(winners.size()).isEqualTo(2);
		assertThat(winners).contains(car3, car4);
	}
}
