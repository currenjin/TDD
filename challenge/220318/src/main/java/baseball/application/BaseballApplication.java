package baseball.application;

import baseball.domain.Balls;
import baseball.domain.PlayResult;
import baseball.util.NumberConverter;
import baseball.util.RandomNumber;

import java.util.Scanner;

public class BaseballApplication {
    public static void main(String[] args) {
        Balls balls = new Balls(RandomNumber.generate(3, 1, 9));
        Boolean start = true;

        while (start) {
            System.out.print("숫자를 입력하세요 : ");
            Scanner scanner = new Scanner(System.in);

            PlayResult playResult = balls.play(NumberConverter.convert(scanner.nextLine()));

            System.out.println(String.format("%s 스트라이크 %s 볼", playResult.getStrike(), playResult.getBall()));
            start = isStart(playResult);
            balls = initBalls(playResult, balls);
        }
    }

    private static Balls initBalls(PlayResult playResult, Balls balls) {
        if (playResult.isGameEnd()) {
            balls = new Balls(RandomNumber.generate(3, 1, 9));
        }
        return balls;
    }

    private static boolean isStart(PlayResult playResult) {
        if (playResult.isGameEnd()) {
            return isRestart();
        }

        return !playResult.isGameEnd();
    }

    private static boolean isRestart() {
        System.out.println("정답입니다! 다시 시작하시겠습니까?");
        System.out.println("재시작 : 1");
        System.out.println("종료 : 2");

        Scanner scanner = new Scanner(System.in);
        Integer number = Integer.parseInt(scanner.nextLine());

        if (number.equals(2)) {
            return false;
        }

        return true;
    }
}
