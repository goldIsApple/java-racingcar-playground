package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car gold;
    @BeforeEach
    void init(){
        gold = new Car(new Name("gold"), new Position());

    }

    @Test
    void 자동차_이름_포지션_검증() {
        // when, then
        Assertions.assertThat(gold.getName()).isEqualTo("gold");
        Assertions.assertThat(gold.getPosition()).isEqualTo(0);
    }

    @Test
    void 자동차_한칸_전진_검증() {
        // when
        gold.moveForward(5);
        // then
        Assertions.assertThat(gold.getPosition()).isEqualTo(1);
    }
    @Test
    void 자동차_정지_검증() {
        // when
        gold.moveForward(3);
        // then
        Assertions.assertThat(gold.getPosition()).isEqualTo(0);
    }

}
