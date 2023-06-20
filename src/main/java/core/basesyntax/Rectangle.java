package core.basesyntax;

public class Rectangle implements Figure {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea() + " sq.units, length: " + length + " units, width: " + width
                        + " units, color: " + color);
    }
}
