package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private final double sideA;
    private final double sideB;
    private final double height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "sideA: " + sideA + " units, "
                + "sideB: " + sideB + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());
    }
}
