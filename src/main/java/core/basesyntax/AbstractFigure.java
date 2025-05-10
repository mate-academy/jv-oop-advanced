package core.basesyntax;

public abstract class AbstractFigure implements Drawable, AreaCalculator, Colorable {
    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
