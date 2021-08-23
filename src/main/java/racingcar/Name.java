package racingcar;

import java.util.Objects;

public class Name {
    private String name;
    public static final int MIN_LENGTH = 1;
    public static final int MAX_LENGTH = 5;

    public Name(String name) {
        validate(name);
        this.name=name;
    }

     void validate(String name) {
        int length = name.length();
        if(length <MIN_LENGTH || length > MAX_LENGTH){
            throw new IllegalArgumentException("자동차 이름을 확인해주시기 바랍니다.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
