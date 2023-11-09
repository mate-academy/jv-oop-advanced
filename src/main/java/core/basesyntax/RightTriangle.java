package core.basesyntax;

public class RightTriangle extends Figure {
    private double length;
    private double width;

    public RightTriangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + " sq.units, length: "
                + length
                + " units, width: "
                + width
                + " units, color: " + color);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
