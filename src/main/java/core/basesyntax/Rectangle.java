package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double length;

    public Rectangle(double width, double length, String color) {
        this.width = width;
        this.length = length;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, width: "
                + width + " units, length: " + length + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
