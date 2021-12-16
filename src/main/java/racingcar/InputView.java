package racingcar;

import java.util.Scanner;

public class InputView {

	private final static Scanner scanner = new Scanner(System.in);
	public static final String INPUT_NAME_FORMAT = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.)";
	public static final String INPUT_COUNT_FORMAT = "시도할 회수는 몇회인가요?";

	public static String inputCarNames(){
		System.out.println(INPUT_NAME_FORMAT);
		return scanner.nextLine();
	}
	public static int inputCount(){
		System.out.println(INPUT_COUNT_FORMAT);
		return scanner.nextInt();
	}
}
