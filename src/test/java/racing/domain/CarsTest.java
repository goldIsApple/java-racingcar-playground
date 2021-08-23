package racing.domain;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void 자동차_경주_우승자_검증() {
        Car car1 = new Car("car1", 2);
        Car car2 = new Car("car2", 2);
        Car car3 = new Car("car3", 0);

        List<Car> racer = Arrays.asList(
                car1,
                car2,
                car3
        );

        Cars cars = new Cars(racer);
        Assertions.assertThat(cars.getWinner()).containsExactly(car1, car2);
    }
}
