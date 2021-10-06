package baseball;

import nextstep.utils.Console;

public class UserInput {
    int inputLen;

    public UserInput(int inputLen) {
        this.inputLen = inputLen;
    };

    public String execute() {
        String inputStr = Console.readLine();

        if (validateStr(inputStr) == false)
            return "[ERROR]";

        return inputStr;
    }

    public boolean validateStr(String inputStr) {
        if (isNotEmpty(inputStr) == false)
            return false;

        if (checkLength(inputStr) == false)
            return false;

        if (isNumber(inputStr) == false)
            return false;

        if (isNotZero(inputStr) == false)
            return false;

        if (isDifferNumber(inputStr) == false)
            return false;


        return true;
    }

    public boolean isNotEmpty(String inputStr) {
        if (inputStr.isEmpty())
            return false;

        return true;
    }

    public boolean checkLength(String inputStr) {
        if (inputStr.length() != inputLen)
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
