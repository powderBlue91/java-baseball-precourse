package baseball;

import nextstep.utils.Console;

public class UserInput {
    int inputLen;

    public UserInput(int inputLen) {
        this.inputLen = inputLen;
    };

    public String execute() {
        String inputStr = Console.readLine();

        if (validateStr(inputStr))
            return "[ERROR]";

        return inputStr;
    }

    public boolean validateStr(String inputStr) {
        if (isEmpty(inputStr))
            return true;

        if (isOutOfLen(inputStr))
            return true;

        if (isNotNumber(inputStr))
            return true;

        return false;
    }
    public boolean isEmpty(String inputStr) {
        if (inputStr.isEmpty())
            return true;

        return false;
    }

    public boolean isOutOfLen(String inputStr) {
        if (inputStr.length() > inputLen)
            return true;

        return false;
    }

    public boolean isNotNumber(String inputStr) {
        for ( int i = 0; i < inputStr.length(); ++i ){
            if (Character.isDigit(inputStr.charAt(i)) == false )
                return true;
        }

        return false;
    }
}
