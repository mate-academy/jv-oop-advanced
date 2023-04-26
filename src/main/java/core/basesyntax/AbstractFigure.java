package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private final String color;

    public AbstractFigure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
