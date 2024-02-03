package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: "
                + length + " units, width: " + width + " units, color: " + this.getColor());
    }
}
