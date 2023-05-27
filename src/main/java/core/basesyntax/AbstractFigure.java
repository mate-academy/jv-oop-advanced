package core.basesyntax;

abstract class AbstractFigure implements Drawable, Calculable {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void draw();
}
