package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected Color color;
    protected double area;

    public Figure(Color color) {
        this.color = color;
    }
}
