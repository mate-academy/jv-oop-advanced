package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, String type, int sideA, int sideB) {
        super(color, type);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, sideA:"
                        + " %s units, sideB: %s units, color: %s%n",
                getType(), getArea(), sideA,
                sideB, getColor());
    }
}
