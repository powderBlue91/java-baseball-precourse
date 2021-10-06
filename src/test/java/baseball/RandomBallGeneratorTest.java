package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomBallGeneratorTest {

    private RandomBalls randomBalls;
    private final int BALL_LENGTH = 3;

    @BeforeEach
    public void setUp() {
        randomBalls = new RandomBalls(BALL_LENGTH);
    }

    @Test
    @DisplayName("입력받은 문자열이 빈 문자열이 아닌지 확인")
    void isNotEmpty() {
        Assertions.assertThat(randomBalls.isNotEmpty("")).isEqualTo(false);
        Assertions.assertThat(randomBalls.isNotEmpty("test")).isEqualTo(true);
    }

    @Test
    @DisplayName("생성된 랜덤 문자열의 길이가 3이 맞는지 확인")
    public void generateBall() {
        String tmpStr = randomBalls.generateBall();
        Assertions.assertThat(tmpStr.length()).isEqualTo(BALL_LENGTH);
    }

    @Test
    @DisplayName("문자열 요소들이 서로 다른지 확인")
    public void isDifferNumber() {
        Assertions.assertThat(randomBalls.isDifferBallNum("111")).isEqualTo(false);
        Assertions.assertThat(randomBalls.isDifferBallNum("567")).isEqualTo(true);
    }
}