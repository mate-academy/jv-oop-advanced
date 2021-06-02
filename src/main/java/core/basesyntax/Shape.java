package core.basesyntax;

public abstract class Shape implements Figure {
    private Color color;

    Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
