package racingcar;

import java.util.Objects;

public class Car {

    public static final int MOVE_CONDITION = 4;
    private Name name;
    private Position position;


    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public void moveForward(int randomNumber) {
        if(randomNumber>= MOVE_CONDITION){
            position.move();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
