package core.basesyntax;

public abstract class AbstractFigure implements Figure, Drawable, AreaCalculator {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
