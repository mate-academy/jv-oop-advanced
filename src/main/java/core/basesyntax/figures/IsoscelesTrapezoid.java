package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void showInfo() {
        System.out.println("Figure: Isosceles Trapezoid, area: " + (sideA * sideB) / (2 * height)
                + " sq. units, side A: " + sideA
                + " units, side B: " + sideB
                + " units, height: " + height + " units, color: " + color);
    }
}
