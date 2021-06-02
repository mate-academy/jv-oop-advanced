package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    protected double area;
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
