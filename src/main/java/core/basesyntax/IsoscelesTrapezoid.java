package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private final int side;
    private final int topSide;
    private final int downSide;
    private final double height;
    private final DecimalFormat format;

    public IsoscelesTrapezoid(String color, int side, int topSide, int downSide) {
        super(color);
        this.format = new DecimalFormat(Figure.FORMAT_FOR_FUNCTIONAL_NUMBERS);
        this.side = side;
        this.topSide = topSide;
        this. downSide = downSide;
        this.height = getHeight();
    }

    private double getHeight() {
        return Math.sqrt((side * side) - (double)(downSide - topSide) * (downSide - topSide) / 4);
    }

    public double getArea() {
        return (double) (topSide + downSide) / 2 * height;
    }

    public String draw() {
        return "Figure: isosceles trapezoid,"
                + " area: " + format.format(getArea()) + " sq.units,"
                + " side: " + side + " units,"
                + " topSide: " + topSide + " units,"
                + " downSide: " + downSide + " units,"
                + " height: " + format.format(getHeight()) + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
