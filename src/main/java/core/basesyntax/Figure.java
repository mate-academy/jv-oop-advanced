package core.basesyntax;

public abstract class Figure {
    public abstract double getArea();
    public abstract String draw();
    private Color color;

    public Figure (Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
