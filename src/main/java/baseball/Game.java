package baseball;

import nextstep.utils.Console;

public class Game {

    RandomNumGenerator randomNumGenerator = new RandomNumGenerator(3);
    UserInput userInput = new UserInput(3);

    String computerBall;

    public Game() {
        init();
    };

    public void init() {
        computerBall = randomNumGenerator.execute();
//        System.out.println("답 " + computerBall);
    }

    public void start() {

        while( true ) {
            System.out.print("숫자를 입력하시오 : ");

            if (execute(Judge.execute(computerBall, userInput.execute())) == false)
                break;
        }
    }

    public boolean execute(JudgeState judgeState) {

        if (judgeState == JudgeState.STRIKE) {
            System.out.println(Judge.getStrikeNum() + "스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

            if(endGame() == false)
                return true;
            return false;
        }

        if (judgeState == JudgeState.NOTHING) {
            System.out.println("낫싱");
            return true;
        }

        if (judgeState == JudgeState.ALL_STRIKE) {
            System.out.println(Judge.getStrikeNum() + "스트라이크");
            return true;
        }

        if (judgeState == JudgeState.ALL_BALL) {
            System.out.println(Judge.getBallNum() + "볼");
            return true;
        }

        if (judgeState == JudgeState.INPUT_ERROR) {
            System.out.println("[ERROR]");
            return true;
        }

        System.out.println(Judge.getStrikeNum() + "스트라이크 " + Judge.getBallNum() + "볼");
        return true;
    }

    public boolean endGame() {
        while ( true ) {
            String inputStr = Console.readLine();
            if ( !(inputStr.equals("1") || inputStr.equals("2")) )
                continue;

            if (inputStr.equals("2")) {
                System.out.println("게임 끝");
                return true;
            }

            if (inputStr.equals("1")) {
                init();
                return false;
            }
        }
    }
}
