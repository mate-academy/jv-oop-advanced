package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private final Color color;

    protected AbstractFigure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
