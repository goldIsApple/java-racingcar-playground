package racing.domain;


import java.util.Objects;

public class Name {

    private static final int  MIN_LENGTH = 1;
    private static final int  MAX_LENGTH = 5;

    private final String name;

    public Name(String name) {
        if(name ==null || name.length()< MIN_LENGTH|| name.length()>MAX_LENGTH){
            throw new IllegalArgumentException("이름을 확인해 주시기 바랍니다.");
        }
        this.name=name;
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

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }
}
