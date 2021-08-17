package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterGroup {

    private List<String> delimiters = new ArrayList<>();

    public DelimiterGroup(String expression) {
        delimiters.add(",");
        delimiters.add(":");

        if(expression==null){
            expression = "";
        }
        addCustomDelimiter(expression);
    }

    private void addCustomDelimiter(String expression) {
        Matcher matcher = Pattern.compile("^//(.)\n").matcher(expression);
        if(matcher.find()){
            delimiters.add(matcher.group(1));
        }
    }

    public String getRegexDelimiter() {
        return this.delimiters
                .stream()
                .reduce((str1, str2) -> str1 + "|" + str2)
                .orElse("");
    }

    public List<String> getDelimiters() {
        return delimiters;
    }
}
