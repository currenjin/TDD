package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            balls.add(new Ball(i+1, numbers.get(i)));
        }

        this.balls = balls;
    }

    public BallStatus play(Ball ball) {
        return balls.stream()
                .map(b -> b.play(ball))
                .filter(status -> status.isNotNothing())
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }
}
