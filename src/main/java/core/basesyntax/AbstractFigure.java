package core.basesyntax;

public abstract class AbstractFigure implements Drawable, AreaCalculator, Colorable {
    protected Color color;

    public abstract double getArea();

    public abstract void draw();

    public abstract Color getColor();
}
