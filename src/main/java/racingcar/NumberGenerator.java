package racingcar;

import java.util.Random;

public class NumberGenerator {

    private static final Random random = new Random();
    public static int generate() {
        return random.nextInt(9) + 1;
    }
}
