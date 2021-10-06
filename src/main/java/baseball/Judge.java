package baseball;

enum JudgeState {
    STRIKE,
    NOTHING,
    ALL_STRIKE,
    ALL_BALL,
    NORMAL,
    INPUT_ERROR
}

public class Judge {

    static int strikeNum;
    static int ballNum;

    static BaseballCounter baseballCounter = new BaseballCounter();

    static public JudgeState execute(String computerBalls, String userBalls) {
        return judgeBaseBall(baseballCounter.countStrike(computerBalls, userBalls),
                baseballCounter.countBall(computerBalls, userBalls));
    }

    static public JudgeState judgeBaseBall(int strikes, int balls) {
        strikeNum = strikes;
        ballNum = balls;

        if (strikeNum == 3)
            return JudgeState.STRIKE;

        if (strikeNum == 0 && ballNum == 0)
            return JudgeState.NOTHING;

        if (strikeNum > 0 && ballNum == 0)
            return JudgeState.ALL_STRIKE;

        if (strikeNum == 0 && ballNum > 0)
            return JudgeState.ALL_BALL;

        return JudgeState.NORMAL;
    }

    static public int getStrikeNum() {
        return strikeNum;
    }

    static public int getBallNum() {
        return ballNum;
    }
}
