package core.basesyntax.model.extended;

import core.basesyntax.model.Figure;
import core.basesyntax.utils.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int sideH;

    public IsoscelesTrapezoid(Color color, int sideA, int sideB, int sideH) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public double calcArea() {
        return ((sideA + sideB) / 2.0) * sideH;
    }

    @Override
    public void draw() {
        double area = calcArea();
        String colorString = color.toString();

        System.out.printf("Figure: circle, area: %,.2f sq.units, side a: %d units, "
                + "side b: %d units, side h: %d units, color: %s%n",
                        area, sideA, sideB, sideH, colorString);
    }
}
