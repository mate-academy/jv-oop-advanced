package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    protected String color;

    public abstract String draw();

    public abstract double getArea();
}
