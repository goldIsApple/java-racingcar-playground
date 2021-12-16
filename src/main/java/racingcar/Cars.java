package racingcar;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = Collections.unmodifiableList(cars);
	}

	public void move(){
		for (Car car : cars) {
			car.move();
			ResultView.result(car);
		}
	}
	public String getWinnersName(){
		return getWinners().stream()
			.map(car->car.getNameToString())
			.collect(Collectors.joining(","));
	}

	public Position getMaxPosition() {
		int maxPosition = cars.stream()
			.mapToInt(car -> car.getPositionToInt())
			.max()
			.orElse(0);
		return new Position(maxPosition);
	}

	public List<Car> getWinners() {
		Position maxPosition = getMaxPosition();
		return cars.stream()
			.filter(car->car.isWinner(maxPosition))
			.collect(Collectors.toList());
	}
}
