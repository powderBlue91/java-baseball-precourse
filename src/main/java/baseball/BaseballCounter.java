package baseball;

public class BaseballCounter {

    public BaseballCounter() {
    }

    public int countStrike(String computerBalls, String userBalls) {
        int strikeNum = 0;

        for (int i = 0; i < computerBalls.length(); ++i) {
            strikeNum += checkEqualBall(computerBalls.charAt(i), userBalls.charAt(i));
        }

        return strikeNum;
    }

    public int checkEqualBall(char computerBall, char userBall) {
        if (computerBall == userBall)
            return 1;
        return 0;
    }

    public int countBall(String computerBall, String userBall) {
        int ballNum = 0;

        for (int i = 0; i < computerBall.length(); ++i) {
            ballNum += checkEqualBallDifferIdx(i, computerBall.charAt(i), userBall);
        }

        return ballNum;
    }

    public int checkEqualBallDifferIdx(int computerBallIdx, char computerBall, String userBall) {
        int ballNum = 0;

        for (int j = 0; j < userBall.length(); ++j) {
            if (computerBallIdx != j ) {
                ballNum += checkEqualBall(computerBall, userBall.charAt(j));
            }
        }

        return ballNum;
    }
}
