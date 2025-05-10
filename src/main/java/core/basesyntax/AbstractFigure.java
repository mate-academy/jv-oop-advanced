package core.basesyntax;

public abstract class AbstractFigure implements AreaCalculator, Drawable {
    protected final Colors color;

    public AbstractFigure(Colors color) {
        this.color = color;
    }
}
