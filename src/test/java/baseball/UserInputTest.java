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
    void isEmpty() {
        Assertions.assertThat(userInput.isEmpty("")).isEqualTo(true);
        Assertions.assertThat(userInput.isEmpty("test")).isEqualTo(false);
    }

    @Test
    @DisplayName("입력받은 문자열 길이가 3을 넘는지 확인")
    void isOutOfLen() {
        Assertions.assertThat(userInput.isOutOfLen("abc1234")).isEqualTo(true);
        Assertions.assertThat(userInput.isOutOfLen("122")).isEqualTo(false);
    }

    @Test
    @DisplayName("입력받은 문자열이 숫자인지 확인")
    void isNotNumber() {
        Assertions.assertThat(userInput.isNotNumber("brzsvfvz")).isEqualTo(true);
        Assertions.assertThat(userInput.isNotNumber("1232132")).isEqualTo(false);
    }
}