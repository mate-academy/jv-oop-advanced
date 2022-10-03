package core.basesyntax.figures;

import core.basesyntax.Colour;
import java.text.DecimalFormat;

public class Circle extends Figure {
    private static final double numberPi = Math.PI;
    private static final int CONST_RADIUS = 10;
    private double radius;

    public Circle() {
        this(Colour.WHITE.name(), CONST_RADIUS);
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
        return "Figure: " + FigureType.CIRCLE.name().toLowerCase() + ", area:"
                + new DecimalFormat("#0.00").format(getArea())
                + " sq.units, radius: " + radius + " units, color: " + getColour();
    }
}
