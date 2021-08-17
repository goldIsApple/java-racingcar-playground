package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void 기본_구분자_합() {
        String expression = "1,2:3";
        Calculator calculator = new Calculator(expression,new DelimiterGroup(expression));
        Assertions.assertThat(calculator.getAnswer()).isEqualTo(6);
    }

    @Test
    void 커스텀_구분자_합() {
        String expression = "//;\n1,2;3";
        Calculator calculator = new Calculator(expression,new DelimiterGroup(expression));
        Assertions.assertThat(calculator.getAnswer()).isEqualTo(6);
    }
    @Test
    void 빈문자열_합() {
        String expression = null;
        Calculator calculator = new Calculator(expression,new DelimiterGroup(expression));
        Assertions.assertThat(calculator.getAnswer()).isEqualTo(0);
    }
    @Test
    void 숫자하나_합() {
        String expression = "1";
        Calculator calculator = new Calculator(expression,new DelimiterGroup(expression));
        Assertions.assertThat(calculator.getAnswer()).isEqualTo(1);
    }
}
