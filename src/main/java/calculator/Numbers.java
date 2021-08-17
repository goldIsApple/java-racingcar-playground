package calculator;

import java.util.List;

public class Numbers {
    private final List<Integer> numbers;
    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getTotal() {
        return this.numbers
                .stream()
                .mapToInt(i->i)
                .sum();
    }
}
