package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

	private final Cars cars;
	private final int count;

	public RacingGame(String names,int count) {
		this.cars = mapToCars(names);
		this.count=count;
	}

	public void start() {
		for (int i = 0; i < count; i++) {
			cars.move();
			System.out.println();
		}
		ResultView.printWinner(cars.getWinnersName());
	}

	private Cars mapToCars(String names) {
		List<Car> cars = new ArrayList<>();

		for (String carName : names.split(",")) {
			cars.add(mapToCar(carName));
		}
		return new Cars(cars);
	}

	private Car mapToCar(String carName) {
		return new Car(carName, 0);
	}
}
