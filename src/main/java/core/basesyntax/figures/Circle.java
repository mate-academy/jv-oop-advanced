package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import java.text.DecimalFormat;

public class Circle extends Figure implements AreaCalculator {
    private static final double numberPi = Math.PI;
    private double radius = 0;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return numberPi * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.CIRCLE.name().toLowerCase() + ", area:"
                + new DecimalFormat("#0.00").format(getArea())
                + " sq.units, radius: " + radius + " units, color: " + getColour();
    }
}
