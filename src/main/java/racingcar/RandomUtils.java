package racingcar;

import java.util.Random;

public class RandomUtils {

	private static final Random random = new Random();
	private static final int MAX_BOUND = 10;

	public static int generateNumber() {
		return random.nextInt(MAX_BOUND);
	}

}
