package core.basesyntax;

public abstract class AbstractFigure implements Figure, Draw {
    protected final Colors color;

    public AbstractFigure(Colors color) {
        this.color = color;
    }

    @Override
    public abstract double calculateArea();

    @Override
    public abstract void draw();
}
