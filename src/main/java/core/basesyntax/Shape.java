package core.basesyntax;

public abstract class Shape implements Drawable{
    private Color color;

    Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
