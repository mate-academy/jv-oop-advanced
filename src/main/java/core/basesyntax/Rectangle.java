package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double height;

    public Rectangle(String color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " sq. units, length: " + length + " units, height: "
                + height + " units, color: " + getColor());
    }
}
