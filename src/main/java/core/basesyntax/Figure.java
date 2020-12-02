package core.basesyntax;

public abstract class Figure implements Draw {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double areaFigure();
}
