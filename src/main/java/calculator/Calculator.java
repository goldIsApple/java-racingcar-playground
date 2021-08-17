package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Calculator {

    private DelimiterGroup delimiterGroup;
    private String expression;

    public Calculator(String expression , DelimiterGroup delimiterGroup) {
        if(expression==null){
            expression = "";
        }
        this.expression = mapNumberExpression(expression);
        this.delimiterGroup = delimiterGroup;
    }

    public int getAnswer() {
        if(expression.isEmpty()){
            return 0;
        }
        Numbers numbers = mapNumbers(expression);
        return numbers.getTotal();
    }

    private String mapNumberExpression(String expression) {
        Matcher matcher = Pattern.compile("//(.)\\n(.*)").matcher(expression);
        if(matcher.find()){
            return matcher.group(2);
        }
        return expression;
    }

    private Numbers mapNumbers(String expression) {
        List<Integer> numbers = Arrays.stream(expression.split(delimiterGroup.getRegexDelimiter()))
                .map(str -> mapInt(str))
                .collect(Collectors.toList());
        return new Numbers(numbers);
    }
    public int mapInt(String str){
        int number = Integer.parseInt(str);
        if(number<0){
            throw new IllegalArgumentException("음수는 계산할수 없습니다.");
        }
        return number;
    }
}
