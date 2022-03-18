package baseball;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    @Test
    void nothing() {
        Balls balls = new Balls(Lists.newArrayList(1, 2, 3));

        assertThat(balls.play(new Ball(1, 4))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball() {
        Balls balls = new Balls(Lists.newArrayList(1, 2, 3));

        assertThat(balls.play(new Ball(2, 1))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike() {
        Balls balls = new Balls(Lists.newArrayList(1, 2, 3));

        assertThat(balls.play(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
    }
}
