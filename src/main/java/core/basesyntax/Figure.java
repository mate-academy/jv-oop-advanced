package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected static final int DECIMAL_FORMAT = 100;
    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }
}
