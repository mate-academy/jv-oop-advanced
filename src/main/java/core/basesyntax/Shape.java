package core.basesyntax;

public abstract class Shape {
    private Color color;

    Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract void drawFigure();
}
