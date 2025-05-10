package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    public static final int MAX_RANDOM_NUMBER = 100;
    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }
}
