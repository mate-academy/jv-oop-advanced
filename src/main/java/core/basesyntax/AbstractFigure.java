package core.basesyntax;

public abstract class AbstractFigure implements Figure {

    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    @Override
    public abstract void printInfo();

}
