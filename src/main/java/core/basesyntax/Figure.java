package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected Color color;

    public Color getColor() {
        return color;
    }
}
