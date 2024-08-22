package core.basesyntax;

public abstract class AbstractFigure implements Figure {
    private Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

