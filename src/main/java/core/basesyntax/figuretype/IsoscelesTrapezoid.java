package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * ((sideA + sideB) * 0.5);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units, sideA: %s"
                        + " units, sideB: %s units, color: %s%n",
                 getArea(), sideA, sideB, getColor());
    }
}
