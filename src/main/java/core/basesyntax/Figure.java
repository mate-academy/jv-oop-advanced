package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
