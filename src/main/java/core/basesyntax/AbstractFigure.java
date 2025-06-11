package core.basesyntax;

public abstract class AbstractFigure implements Drawable, AreaCalculator {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract void draw();
}
