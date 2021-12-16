package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
	private static final String RESULT_FORMAT="%s : %s";
	private static final String WINNER_FORMAT="%s가 최종 우승했습니다.";

	public static void result(Car car){
			System.out.println(String.format(RESULT_FORMAT,car.getNameToString(),getResultPosition(car)));
	}

	private static String getResultPosition(Car car) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < car.getPositionToInt(); i++) {
			sb.append("-");
		}
		return sb.toString();
	}

	public static void printWinner(String winnersName) {
		System.out.println(String.format(WINNER_FORMAT,winnersName));
	}
}
