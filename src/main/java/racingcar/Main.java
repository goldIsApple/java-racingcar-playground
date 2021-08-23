package racingcar;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Name> names = InputView.inputCarNames();
        Cars cars =Cars.createCars(names);
        Racing racing = new Racing(cars,InputView.getTryCount());
        racing.start();
    }

}
