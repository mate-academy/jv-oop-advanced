package core.basesyntax;

public abstract class Figure implements drawable, AreaCalculator {
    protected final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
}
