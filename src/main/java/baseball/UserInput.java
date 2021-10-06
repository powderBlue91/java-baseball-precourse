package baseball;

import nextstep.utils.Console;

public class UserInput {
    int ballLength;

    public UserInput(int inputLen) {
        this.ballLength = inputLen;
    };

    public String execute() {
        String userBalls = Console.readLine();

        if (validate(userBalls) == false) {
            throw new IllegalArgumentException();
        }

        return userBalls;
    }

    public boolean validate(String userBalls) {
        if (isNotEmpty(userBalls) == false ||
                checkLength(userBalls) == false ||
                isNumber(userBalls) == false ||
                isNotZero(userBalls) == false ||
                isDifferNumber(userBalls) == false)
            return false;

        return true;
    }

    public boolean isNotEmpty(String userBalls) {
        if (userBalls.isEmpty()) {
            return false;
        }

        return true;
    }

    public boolean checkLength(String userBalls) {
        if (userBalls.length() != ballLength) {
            return false;
        }

        return true;
    }

    public boolean isNumber(String userBalls) {
        for ( int i = 0; i < userBalls.length(); ++i ) {
            if (Character.isDigit(userBalls.charAt(i)) == false) {
                return false;
            }
        }

        return true;
    }

    public boolean isNotZero(String userBalls) {
        if (userBalls.contains("0") == true) {
            return false;
        }
        return true;
    }

    public boolean isDifferNumber(String userBalls) {
        if ( userBalls.charAt(0) == userBalls.charAt(1) ||
                userBalls.charAt(1) == userBalls.charAt(2) ||
                userBalls.charAt(2) == userBalls.charAt(0))
            return false;

        return true;
    }
}
