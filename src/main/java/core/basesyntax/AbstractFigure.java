package core.basesyntax;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    protected String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
