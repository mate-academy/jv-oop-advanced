package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private final int opposite;
    private final int adjacent;
    private final DecimalFormat format;

    public RightTriangle(String color, int opposite, int adjacent) {
        super(color);
        this.format = new DecimalFormat("#0.0");
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

    public String draw() {
        return "Figure: right triangle,"
                + " area: " + getArea() + " sq.units,"
                + " opposite: " + opposite + " units,"
                + " adjacent: " + adjacent + " units,"
                + " hypotenuse: " + format.format(getHypotenuse()) + " units,"
                + " color: " + getColor();
    }
}
