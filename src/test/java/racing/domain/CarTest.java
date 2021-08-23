package racing.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_이름_포지션() {
        Car car = new Car("car12");
        assertThat(car).isEqualTo(new Car("car12"));
    }

    @Test
    void 자동차_랜덤값4_이상_전진() {
        Car car = new Car("car1");
        car.move(4);
        assertThat(car).isEqualTo(new Car("car1", 1));
    }
    @Test
    void 자동차_랜덤값4_미만_정지() {
        Car car = new Car("car1");
        car.move(3);
        assertThat(car).isEqualTo(new Car("car1", 0));
    }

}
