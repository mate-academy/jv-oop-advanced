package core.basesyntax.model;

public class Rectangle extends Color {
    private double length;
    private double width;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: "
                + length + " units, width: " + width + " units, color: " + getColor());
    }
}
