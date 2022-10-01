package core.basesyntax.figures;

import core.basesyntax.Colours;
import java.text.DecimalFormat;

public class Circle extends Figure {
    private static final double numberPi = Math.PI;
    private static final int CONST_RADIUS = 10;
    private double radius = 0;

    public Circle() {
        super(Colours.WHITE.name());
        this.radius = CONST_RADIUS;
    }

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return numberPi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.CIRCLE.name().toLowerCase() + ", area:"
                + new DecimalFormat("#0.00").format(getArea())
                + " sq.units, radius: " + radius + " units, color: " + getColour();
    }
}
