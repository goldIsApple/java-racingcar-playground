package racingcar;

import java.util.Objects;

public class Position {

	private static final int FORWARD_CONDITION = 4;
	private static final String BOUND_MESSAGE = "랜덤값의 범위는 0~9 사이 입니다";
	private static final int MIN = 0;
	private static final int MAX = 9;

	private final int position;

	public Position() {
		this(0);
	}

	public Position(int position) {
		this.position = position;
	}

	public Position move(int randomNumber) {
		if(randomNumber < MIN || randomNumber > MAX) {
			throw new IllegalArgumentException(BOUND_MESSAGE);
		}
		if (randomNumber >= FORWARD_CONDITION) {
			return new Position(position + 1);
		}
		return this;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Position position1 = (Position) o;
		return position == position1.position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}
}
