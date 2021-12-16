package racingcar;

public class RacingMain {

	public static void main(String[] args) {
		RacingGame racingGame = new RacingGame(InputView.inputCarNames(), InputView.inputCount());
		racingGame.start();
	}

}
