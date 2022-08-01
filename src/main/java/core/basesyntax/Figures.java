package core.basesyntax;

public abstract class Figures implements Behavior {
    public static final int MAX_SIDE = 100;
    protected String color;

    protected Figures(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
