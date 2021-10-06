package baseball;

public class MessageUtil {

    public static void judgeMessage(JudgeState state) {
        if (state == JudgeState.STRIKE) strikeMessage();
        if (state == JudgeState.NOTHING) nothingMessage();
        if (state == JudgeState.ALL_STRIKE) allStrikeMessage();
        if (state == JudgeState.ALL_BALL) allBallMessage();
        if (state == JudgeState.NORMAL) normalMessage();
    }

    public static void strikeMessage() {
        System.out.println(Judge.getStrikeNum() + "스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 끝");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
    }

    public static void nothingMessage() {
        System.out.println("낫싱");
    }

    public static void allStrikeMessage() {
        System.out.println(Judge.getStrikeNum() + "스트라이크");
    }

    public static void allBallMessage() {
        System.out.println(Judge.getBallNum() + "볼");
    }

    public static void normalMessage() {
        System.out.println(Judge.getStrikeNum() + "스트라이크 " + Judge.getBallNum() + "볼");
    }

    public static void inputNumberMessage() {
        System.out.print("숫자를 입력하시오 : ");
    }

    public static void errorMessage() {
        System.out.println("[ERROR]");
    }

    public static void endGameMessage() {
        System.out.println("게임 끝");
    }
}
