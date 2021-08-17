package calculator;


import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

public class DelimiterGroupTest {

    @Test
    void 기본_구분자_커스텀_구분자를_가진다() {
        DelimiterGroup delimiterGroup = new DelimiterGroup("//]\n1,2;3");
        assertThat(delimiterGroup.getDelimiters()).contains(",", ":", "]");
    }
    @Test
    void 구분자_정규표현식_검증() throws Exception{
        DelimiterGroup delimiterGroup = new DelimiterGroup("//]\n1,2;3");
        assertThat(delimiterGroup.getRegexDelimiter()).isEqualTo(",|:|]");
    }

}
