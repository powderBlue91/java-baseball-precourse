package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballCounterTest {

    private BaseballCounter baseballCounter;

    final static int NO_STRIKE = 0;
    final static int ONE_STRIKE = 1;
    final static int TWO_STRIKE = 2;
    final static int THREE_STRIKE = 3;

    final static int NO_BALL = 0;
    final static int ONE_BALL = 1;
    final static int TWO_BALL = 2;
    final static int THREE_BALL = 3;

    @BeforeEach
    public void setUp() {
        baseballCounter = new BaseballCounter();
    }

    @Test
    void countStrike() {
        Assertions.assertThat(baseballCounter.countStrike("123", "123")).isEqualTo(THREE_STRIKE);

        Assertions.assertThat(baseballCounter.countStrike("129", "126")).isEqualTo(TWO_STRIKE);
        Assertions.assertThat(baseballCounter.countStrike("528", "578")).isEqualTo(TWO_STRIKE);

        Assertions.assertThat(baseballCounter.countStrike("167", "123")).isEqualTo(ONE_STRIKE);

        Assertions.assertThat(baseballCounter.countStrike("123", "456")).isEqualTo(NO_STRIKE);
    }

    @Test
    void countBall() {
        Assertions.assertThat(baseballCounter.countBall("132", "321")).isEqualTo(THREE_BALL);

        Assertions.assertThat(baseballCounter.countBall("753", "385")).isEqualTo(TWO_BALL);
        Assertions.assertThat(baseballCounter.countBall("931", "613")).isEqualTo(TWO_BALL);

        Assertions.assertThat(baseballCounter.countBall("789", "176")).isEqualTo(ONE_BALL);

        Assertions.assertThat(baseballCounter.countBall("654", "789")).isEqualTo(NO_BALL);
    }
}