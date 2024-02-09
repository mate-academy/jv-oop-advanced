package core.basesyntax;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
