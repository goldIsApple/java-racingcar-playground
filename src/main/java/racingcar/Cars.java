package racingcar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    private Cars(List<Car> cars) {
        validateDuplicateName(cars);
        this.cars = cars;
    }

    public static Cars createCars(List<Name> names) {
        List<Car> cars = getCars(names);
        return new Cars(cars);
    }

    public List<Car> race() {
        List<Car> resultCars = new ArrayList<>();
        cars.forEach(car->{
            int randomNumber = NumberGenerator.generate();
            car.moveForward(randomNumber);
            resultCars.add(car);
        });
        return resultCars;
    }


    public List<Car> getWinner() {
        int maxPosition = getMaxPosition();
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }
    private static List<Car> getCars(List<Name> names) {
        return names.stream()
                .map(name -> new Car(name, new Position()))
                .collect(Collectors.toList());
    }

    private void validateDuplicateName(List<Car> cars) {
        if(new HashSet<>(cars).size() != cars.size()){
            throw new IllegalArgumentException("중복된 차 이름이 존재합니다.");
        }
    }
}
