package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double sideB;
    private final double sideA;
    private final double height;

    public IsoscelesTrapezoid(Color color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", sideA: " + formatValue(sideA) + " units"
                + ", sideB: " + formatValue(sideB) + " units"
                + ", height: " + formatValue(height) + " units"
                + ", area: " + formatValue(getArea()) + " sq.units"
                + ", color: " + color);
    }

    @Override
    public double getArea() {
        return height / 2 * (sideA + sideB);
    }
}
