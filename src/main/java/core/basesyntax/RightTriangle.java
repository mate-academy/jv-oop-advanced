package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private double side;
    private double height;
    private DecimalFormat df = new DecimalFormat("#.00");

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
        return "Figure: right triangle, area: " + df.format(getArea()) + " sq. units, side: "
                + df.format(side) + " units, height: " + df.format(height) + " units, color: "
                + getColor();
    }
}
