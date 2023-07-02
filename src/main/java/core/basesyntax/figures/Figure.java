package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    protected String color;
    protected double area;

    protected abstract double findArea();
}
