package core.basesyntax;

import java.text.DecimalFormat;

public class Square extends Figure {
    private double side;
    private DecimalFormat df = new DecimalFormat("#.00");

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + df.format(getArea()) + " sq. units, side: "
                + df.format(side) + " units, color: " + getColor();
    }
}
