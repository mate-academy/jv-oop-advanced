package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final double leg1;
    private final double leg2;

    public RightTriangle(Color color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", first cathetus: " + formatValue(leg1) + " units"
                + ", second cathetus: " + formatValue(leg2) + " units"
                + ", hypotenuse: " + formatValue(getHypotenuse()) + " units"
                + ", area: " + formatValue(getArea()) + " sq.units"
                + ", color: " + color);
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }
}
