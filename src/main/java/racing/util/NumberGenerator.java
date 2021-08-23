package racing.util;

import java.util.Random;

public class NumberGenerator {
    private static final Random RANDOM = new Random();
    public static int createRandomNumber() {
        return RANDOM.nextInt(10) + 1;
    }
}
