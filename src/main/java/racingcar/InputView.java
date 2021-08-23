package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private final static Scanner in = new Scanner(System.in);

    public static List<Name> inputCarNames(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분.");
        String names = in.nextLine();
        return toNames(names);
    }

    private static List<Name> toNames(String names) {
        String[] split = names.split(",");
        return Arrays.stream(split)
                .map(name -> new Name(name))
                .collect(Collectors.toList());
    }

    public static int getTryCount(){
        System.out.println("시도할 회수는 몇회인가요");
        return in.nextInt();
    }

}
