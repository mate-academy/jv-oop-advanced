package core.basesyntax.model;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(int sideA, int sideB, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB + " units, color: " + getColor());
    }
}
