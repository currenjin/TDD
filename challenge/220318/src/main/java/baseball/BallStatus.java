package baseball;

public enum BallStatus {
    BALL, STRIKE, NOTHING;

    public boolean isNotNothing() {
        return this != BallStatus.NOTHING;
    }
}
