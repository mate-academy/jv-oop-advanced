package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid implements Figure {
    private final int side;
    private final int topSide;
    private final int downSide;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(String color, int side, int topSide, int downSide) {
        this.color = color;
        this.side = side;
        this.topSide = topSide;
        this. downSide = downSide;
        this.height = getHeight();
    }

    public double getHeight() {
        return Math.sqrt((side * side) - (double)(downSide - topSide) * (downSide - topSide) / 4);
    }

    public double getArea() {
        return (double) (topSide + downSide) / 2 * height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid,"
                + " area: " + new DecimalFormat("#0.0").format(getArea()) + " sq.units,"
                + " side: " + side + " units,"
                + " topSide: " + topSide + " units,"
                + " downSide: " + downSide + " units,"
                + " height: " + new DecimalFormat("#0.0").format(getHeight()) + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
