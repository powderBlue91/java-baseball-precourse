package baseball;

import nextstep.utils.Randoms;

public class RandomBalls {

    int ballLength;

    public RandomBalls(int strLength) {
        this.ballLength = strLength;
    };

    public String execute() {
        String randomBalls = "";

        while( true ) {
            randomBalls = generateBall();

            if (validate(randomBalls)) {
                break;
            }
        }

        return randomBalls;
    }

    public String generateBall() {
        String tmpStr = "";

        for (int i = 0; i < ballLength; ++i) {
            tmpStr += Integer.toString(Randoms.pickNumberInRange(1,9));
        }

        return tmpStr;
    }

    public boolean validate(String randomStr) {
        if (isNotEmpty(randomStr) == false) {
            return false;
        }

        if (isDifferBallNum(randomStr) == false) {
            return false;
        }

        return true;
    }

    public boolean isNotEmpty(String randomStr) {
        if (randomStr.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean isDifferBallNum(String randomStr) {
        if (randomStr.charAt(0) == randomStr.charAt(1) ||
                randomStr.charAt(1) == randomStr.charAt(2) ||
                randomStr.charAt(2) == randomStr.charAt(0))
            return false;

        return true;
    }
}
