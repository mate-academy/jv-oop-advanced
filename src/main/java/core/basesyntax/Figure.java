package core.basesyntax;

public abstract class Figure implements Drawable {
    private final Color color;
    private final double area;

    public Figure(double area, Color color) {
        this.area = area;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}
