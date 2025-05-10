package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + String.format("%.1f", getArea())
                + " sq.units, length: " + length + " units, width: " + width
                + " units, color: " + getColor());
    }
}
