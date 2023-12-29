package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    protected final Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }
}
