package core.basesyntax;

public abstract class FigCol implements Figure {
    private Color color;

    public FigCol(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
