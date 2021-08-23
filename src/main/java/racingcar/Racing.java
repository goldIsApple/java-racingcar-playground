package racingcar;

public class Racing {
    private Cars cars;
    private int tryCount;

    public Racing(Cars cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public void start() {
        for (int i = 0; i < tryCount; i++) {
            ResultView.printRaceResult(cars.race());
        }
        ResultView.printRaceWinner(cars.getWinner());
    }

}
