package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.height = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle,"
                + " area: " + calculateArea()
                + " sq. units, height: " + height
                + " units, width: " + width
                + " units, color: " + getColor());
    }
}
