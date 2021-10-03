package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {
    private UserInput userInput;

    @BeforeEach
    public void setUp() {
        userInput = new UserInput(3);
    }

    @Test
    @DisplayName("입력받은 문자열이 빈 문자열이 아닌지 확인")
    void isNotEmpty() {
        Assertions.assertThat(userInput.isNotEmpty("")).isEqualTo(false);
        Assertions.assertThat(userInput.isNotEmpty("test")).isEqualTo(true);
    }

    @Test
    @DisplayName("입력받은 문자열 길이가 3인지 확인")
    void checkLength() {
        Assertions.assertThat(userInput.checkLength("15871381248")).isEqualTo(false);
        Assertions.assertThat(userInput.checkLength("1")).isEqualTo(false);
        Assertions.assertThat(userInput.checkLength("122")).isEqualTo(true);

    }

    @Test
    @DisplayName("입력받은 문자열이 숫자인지 확인")
    void isNumber() {
        Assertions.assertThat(userInput.isNumber("brzsvfvz")).isEqualTo(false);
        Assertions.assertThat(userInput.isNumber("1232132")).isEqualTo(true);
    }
}