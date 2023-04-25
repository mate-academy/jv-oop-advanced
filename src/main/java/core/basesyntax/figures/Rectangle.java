package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + calculateArea() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, color: "
                + getColor());
    }
}
