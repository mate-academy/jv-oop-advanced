package core.basesyntax;

abstract class AbstractFigure implements Figure {
    private Color color = Color.white;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
