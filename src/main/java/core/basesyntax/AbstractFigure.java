package core.basesyntax;

abstract class AbstractFigure implements Figure, Area {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();
}
