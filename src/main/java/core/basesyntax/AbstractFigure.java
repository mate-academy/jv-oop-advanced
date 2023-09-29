package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    protected String color;

    @Override
    public String getColor() {
        return color;
    }
}
