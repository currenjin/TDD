package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return this.position;
    }

    public void move(int position) {
        this.position += position;
    }
}
