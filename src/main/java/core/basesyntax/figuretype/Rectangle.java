package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
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
        System.out.printf("Figure: rectangle, area: %.1f sq.units, sideA:"
                        + " %s units, sideB: %s units, color: %s%n",
                getArea(), sideA, sideB, getColor());
    }
}
