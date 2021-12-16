package racingcar;

import java.util.Objects;

public class Name {

	private static final String NULL_MESSAGE = "자동차 이름은 공백일수 없습니다.";
	private static final String LENGTH_FORMAT = "자동차 이름은 %d 글자를 초과 할 수 없습니다. 현재 입력한 이름 : [%s]";
	private static final int MAX_LENGTH = 5;
	private final String name;

	public Name(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException(NULL_MESSAGE);
		}
		if (name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(String.format(LENGTH_FORMAT, MAX_LENGTH, name));
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Name name1 = (Name) o;
		return Objects.equals(name, name1.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
