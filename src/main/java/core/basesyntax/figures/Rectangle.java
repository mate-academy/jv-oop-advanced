package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq. units, length: "
                + length + " units, width: " + width + " units, color: " + getColor());
    }
}
