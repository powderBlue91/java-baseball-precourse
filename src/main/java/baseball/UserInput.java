package baseball;

import nextstep.utils.Console;

public class UserInput {
    int ballLength;

    public UserInput(int inputLen) {
        this.ballLength = inputLen;
    };

    public String execute() {
        String userBalls = Console.readLine();

        if (validate(userBalls) == false)
            return "[ERROR]";

        return userBalls;
    }

    public boolean validate(String userBalls) {
        if (isNotEmpty(userBalls) == false)
            return false;

        if (checkLength(userBalls) == false)
            return false;

        if (isNumber(userBalls) == false)
            return false;

        if (isNotZero(userBalls) == false)
            return false;

        if (isDifferNumber(userBalls) == false)
            return false;


        return true;
    }

    public boolean isNotEmpty(String inputStr) {
        if (inputStr.isEmpty())
            return false;

        return true;
    }

    public boolean checkLength(String inputStr) {
        if (inputStr.length() != ballLength)
            return false;

        return true;
    }

    public boolean isNumber(String inputStr) {
        for ( int i = 0; i < inputStr.length(); ++i ) {
            if (Character.isDigit(inputStr.charAt(i)) == false)
                return false;
        }

        return true;
    }

    public boolean isNotZero(String inputStr) {
        if (inputStr.contains("0") == true)
            return false;
        return true;
    }

    public boolean isDifferNumber(String inputStr) {
        if ( inputStr.charAt(0) == inputStr.charAt(1) ||
                inputStr.charAt(1) == inputStr.charAt(2) ||
                inputStr.charAt(2) == inputStr.charAt(0))
            return false;

        return true;
    }
}
