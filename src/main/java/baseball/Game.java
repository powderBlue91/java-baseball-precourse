package baseball;

import nextstep.utils.Console;

public class Game {

    RandomBalls randomBalls = new RandomBalls(3);
    UserInput userInput = new UserInput(3);

    String computerBall;

    public Game() {
        init();
    };

    public void init() {
        computerBall = randomBalls.execute();
    }

    public void start() {

        while( true ) {
            MessageUtil.inputNumberMessage();

            try {
                if (execute(Judge.execute(computerBall, userInput.execute())) == false)
                    break;
            } catch(IllegalArgumentException e) {
                MessageUtil.errorMessage();
            }
        }
    }

    public boolean execute(JudgeState judgeState) {
        if (judgeState == JudgeState.STRIKE) {
            MessageUtil.judgeMessage(judgeState);
            if(endGame() == false)
                return true;
            return false;
        }

        if (judgeState == JudgeState.NOTHING ||
                judgeState == JudgeState.ALL_STRIKE ||
                judgeState == JudgeState.ALL_BALL ||
                judgeState == JudgeState.NORMAL ) {
            MessageUtil.judgeMessage(judgeState);
            return true;
        }

        return true;
    }

    public boolean endGame() {
        while ( true ) {
            String inputStr = Console.readLine();
            if ( !(inputStr.equals("1") || inputStr.equals("2")) )
                continue;

            if (inputStr.equals("2")) {
                MessageUtil.endGameMessage();
                return true;
            }

            if (inputStr.equals("1")) {
                init();
                return false;
            }
        }
    }
}
