package racingcar;

public class Car {
	private final Name name;
	private Position position;

	public Car(String name, int position) {
		this.name = new Name(name);
		this.position = new Position(position);
	}

	public void move(){
		position = position.move(RandomUtils.generateNumber());
	}

	public int getPositionToInt() {
		return position.getPosition();
	}

	public boolean isWinner(Position maxPosition) {
		return position.equals(maxPosition);
	}

	public String getNameToString() {
		return name.getName();
	}
}
