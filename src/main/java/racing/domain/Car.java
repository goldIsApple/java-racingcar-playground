package racing.domain;

import java.util.Objects;

public class Car {
    private static final int FORWARD_NUM = 4;
    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name,int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int randomNumber) {
        if(randomNumber>= FORWARD_NUM){
            this.position.move();
        }
    }

    public int getPosition() {
        return position.getPosition();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }

    public boolean isMaxPosition(int maxPosition) {
        return position.isSame(maxPosition);
    }
}
