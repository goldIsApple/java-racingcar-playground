package racing.domain;

import java.util.Objects;

public class Position {
    private int position;

    public Position(){
        this(0);
    }
    public Position(int position) {
        if(position<0){
            throw new IllegalArgumentException("포지션음 음수를 가질수 없습니다.");
        }
        this.position=position;
    }

    public Position move() {
        position++;
        return this;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        return "Position{" +
                "position=" + position +
                '}';
    }


    public boolean isSame(int maxPosition) {
        return position==maxPosition;
    }
}
