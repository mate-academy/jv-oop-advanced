package core.basesyntax;

public abstract class Figure implements Drawable {
    private final double area;
    private final Colors color;

    public Figure(double area, Colors color) {
        this.area = area;
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public Colors getColor() {
        return color;
    }

}
