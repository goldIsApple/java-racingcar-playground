package racing.domain;

public class Racing {
    private final Cars cars;
    private final int tryCount;

    public Racing(Cars cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public void start(){
        cars.start();
    }

}
