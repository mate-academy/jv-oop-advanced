package core.basesyntax;

public class RightTriangle extends Figure {
    private double side1;
    private double height;

    public RightTriangle(String color, double side1, double height) {
        super(color);
        this.side1 = side1;
        this.height = height;
    }

    @Override
    double getArea() {
        return (side1 * height) / 2;
    }

    @Override
    String getInfo() {
        return "Figure: right triangle, area: " + getArea() + " sq.units, side1: " + side1
                + " height: " + height + " units, color: " + getColor();
    }
}
