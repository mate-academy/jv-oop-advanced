package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
