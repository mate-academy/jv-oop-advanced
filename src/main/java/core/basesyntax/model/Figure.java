package core.basesyntax.model;

public abstract class Figure implements Drawable {
    private double area;
    private Color color;

    Figure(double area, Color color) {
        this.area = area;
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public double getArea() {
        return area;
    }
}
