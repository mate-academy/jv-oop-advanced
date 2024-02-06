package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final int MAX_SIDE = 100;
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
