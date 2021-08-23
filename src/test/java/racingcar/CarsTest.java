package racingcar;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {



    @Test
    void 자동차_경주_검증() throws Exception{


        List<Name> names = Arrays.asList(
                new Name("gold"),
                new Name("gold1"),
                new Name("gold2"),
                new Name("gold3")
        );
        Cars cars = Cars.createCars(names);
        List<Car> race = cars.race();
        org.assertj.core.api.Assertions.assertThat(race.size()).isEqualTo(4);
    }

    @Test
    void 자동차_이름_중복_검증() {
        List<Name> names = Arrays.asList(
                new Name("gold"),
                new Name("gold1"),
                new Name("gold1"),
                new Name("gold3")
        );

        Assertions.assertThrows(IllegalArgumentException.class, () -> Cars.createCars(names));
    }
}
