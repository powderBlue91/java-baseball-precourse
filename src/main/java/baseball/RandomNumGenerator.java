package baseball;

import nextstep.utils.Randoms;

public class RandomNumGenerator {

    int randomStrLength;

    public RandomNumGenerator(int strLength) {
        this.randomStrLength = strLength;
    };

    public String execute() {
        String randomStr = "";

        while( true ) {
            randomStr = generateBall();

            if (validateStr(randomStr))
                break;
        }

        return randomStr;
    }

    public String generateBall() {
        String tmpStr = "";

        for ( int i = 0; i < randomStrLength; ++i) {
            tmpStr += Integer.toString(Randoms.pickNumberInRange(1,9));
        }

        return tmpStr;
    }

    public boolean validateStr(String randomStr) {
        if (isNotEmpty(randomStr) == false)
            return false;

        if (isDifferBallNum(randomStr) == false)
            return false;

        return true;
    }

    public boolean isNotEmpty(String randomStr) {
        if (randomStr.isEmpty())
            return false;

        return true;
    }

    public boolean isDifferBallNum(String randomStr) {
        if ( randomStr.charAt(0) == randomStr.charAt(1) ||
                randomStr.charAt(1) == randomStr.charAt(2) ||
                randomStr.charAt(2) == randomStr.charAt(0))
            return false;

        return true;
    }
}
