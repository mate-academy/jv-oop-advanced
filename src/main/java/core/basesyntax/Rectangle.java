package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle() {
    }

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
        System.out.println("Figure: rectangle, area: "
                + String.format("%.2f", getArea())
                + ", width: "
                + width
                + ", length: "
                + length
                + ", color: "
                + getColor());
    }
}
