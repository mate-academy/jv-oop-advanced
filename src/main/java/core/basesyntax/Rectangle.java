package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(Color color, double length, double width) {

        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: rectangle, area: " + calculateArea() + "sq. units, length: "
                + length + "sq. units, width: " + width + "sq. units, color: " + getColor());
    }
}
