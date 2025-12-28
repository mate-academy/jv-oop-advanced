package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, width: " + width
                + " units, length: " + length + " units, color: " + color);
    }
}
