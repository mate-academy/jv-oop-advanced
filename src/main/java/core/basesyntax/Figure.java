package core.basesyntax;

public abstract class Figure implements Draw {
    private Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public Color getColor() {
        return color;
    }
}
