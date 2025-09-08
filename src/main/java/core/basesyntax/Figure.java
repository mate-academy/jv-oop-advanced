package core.basesyntax;

public abstract class Figure implements AreaFigure, DrawFigure {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract void draw();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " with color " + color;
    }
}
