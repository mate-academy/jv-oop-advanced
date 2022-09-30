package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private final int opposite;
    private final int adjacent;

    public RightTriangle(String color, int opposite, int adjacent) {
        super(color);
        this.opposite = opposite;
        this.adjacent = adjacent;
    }

    public double getHypotenuse() {
        return Math.sqrt((opposite * opposite) + (adjacent * adjacent));
    }

    @Override
    public double getArea() {
        return (double)(opposite * adjacent) / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle,"
                + " area: " + getArea() + " sq.units,"
                + " opposite: " + opposite + " units,"
                + " adjacent: " + adjacent + " units,"
                + " hypotenuse: " + new DecimalFormat("#0.0").format(getHypotenuse()) + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
