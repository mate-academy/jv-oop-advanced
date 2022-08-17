package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }
}
