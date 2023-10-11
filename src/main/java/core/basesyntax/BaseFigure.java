package core.basesyntax;

public abstract class BaseFigure implements Figure, AreaAble {
    protected final Color color;

    public BaseFigure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
