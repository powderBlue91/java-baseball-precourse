package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {

    @Test
    @DisplayName("3스트라이크인 경우")
    public void strike() {
        Assertions.assertThat(Judge.judgeBaseBall(3, 3)).isEqualTo(JudgeState.STRIKE);
        Assertions.assertThat(Judge.judgeBaseBall(3, 1)).isEqualTo(JudgeState.STRIKE);
        Assertions.assertThat(Judge.judgeBaseBall(3, 2)).isEqualTo(JudgeState.STRIKE);
        Assertions.assertThat(Judge.judgeBaseBall(3, 0)).isEqualTo(JudgeState.STRIKE);
    }

    @Test
    @DisplayName("볼은 없고, 스트라이크가 3미만인 경우")
    public void strikeNoBall() {
        Assertions.assertThat(Judge.judgeBaseBall(1, 0)).isEqualTo(JudgeState.ALL_STRIKE);
        Assertions.assertThat(Judge.judgeBaseBall(2, 0)).isEqualTo(JudgeState.ALL_STRIKE);

//        Assertions.assertThat(Judge.judgeBaseBall(3, 0)).isNotEqualTo("3스트라이크");
    }

    @Test
    @DisplayName("볼0, 스트라이크0 인 경우")
    public void nothing() {
        Assertions.assertThat(Judge.judgeBaseBall(0, 0)).isEqualTo(JudgeState.NOTHING);
    }

    @Test
    @DisplayName("스트라이크는 없고, 볼만 있는 경우")
    public void ballNoStrike() {
        Assertions.assertThat(Judge.judgeBaseBall(0, 1)).isEqualTo(JudgeState.ALL_BALL);
        Assertions.assertThat(Judge.judgeBaseBall(0, 2)).isEqualTo(JudgeState.ALL_BALL);
        Assertions.assertThat(Judge.judgeBaseBall(0, 3)).isEqualTo(JudgeState.ALL_BALL);
        Assertions.assertThat(Judge.judgeBaseBall(0, 4)).isEqualTo(JudgeState.ALL_BALL);
    }
}