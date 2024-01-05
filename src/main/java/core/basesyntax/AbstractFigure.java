package core.basesyntax;

public abstract class AbstractFigure implements Drawable, AreaCalculator {
    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public AbstractFigure() {
    }

    public Color getColor() {
        return color;
    }
}
