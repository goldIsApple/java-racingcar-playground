package racingcar;

import java.util.List;

public class ResultView {

    private static final String ENTER = System.lineSeparator();
    private static final String FORMAT = "%s : %s";
    private static final String DISTANCE = "-";

    public static void printRaceResult(List<Car> cars) {
        StringBuilder log = new StringBuilder();
        cars.forEach(car->{
            log.append(String.format(FORMAT, car.getName(), toStringByPosition(car.getPosition())));
            log.append(ENTER);
        });
        System.out.println(log.toString());
    }


    public static void printRaceWinner(List<Car> cars) {
        String winners = cars.stream()
                .map(Car::getName)
                .reduce((car1, car2) -> car1 + ", " + car2)
                .orElseThrow(() -> new IllegalArgumentException("우승자가 없습니다."));

        System.out.println(winners + "가 최종 우승했습니다.");
    }

    private static String toStringByPosition(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append(DISTANCE);
        }
        return sb.toString();
    }


}
