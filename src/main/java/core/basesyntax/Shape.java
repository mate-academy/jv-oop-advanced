package core.basesyntax;

public abstract class Shape {
    protected Color color;
    protected double area;

    public abstract double getArea();

    public abstract Color getColor();

    public abstract void draw();
}
