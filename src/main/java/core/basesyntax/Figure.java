package core.basesyntax;

public abstract class Figure {
    public abstract double getArea();
    public abstract void draw();
    private Color color;

    public Figure (Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
