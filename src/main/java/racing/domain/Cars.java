package racing.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import racing.util.NumberGenerator;

public class Cars {

    private final List<Car> cars;
    public Cars(List<Car> cars) {
        this.cars = new ArrayList<>(cars);
    }

    public List<Car> getWinner() {
        return getWinner(getMaxPosition());
    }

    private List<Car> getWinner(int maxPosition) {
        return cars.stream()
                .filter(car->car.isMaxPosition(maxPosition))
                .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

    public void start() {
        cars.forEach(car ->
                car.move(NumberGenerator.createRandomNumber())
        );
    }
}
