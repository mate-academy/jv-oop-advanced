package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;
    private double height;

    public RightTriangle(String color, double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * side * height;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + getDecimalFormat().format(getArea())
                + " sq. units, side: " + getDecimalFormat().format(side) + " units, height: "
                + getDecimalFormat().format(height) + " units, color: "
                + getColor();
    }
}
