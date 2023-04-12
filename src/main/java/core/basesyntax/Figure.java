package core.basesyntax;

public abstract class Figure implements Drawable {
    private final Colors color;
    private final double area;

    Figure(double area, Colors color) {
        this.area = area;
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }
}
