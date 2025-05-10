package core.basesyntax.entity;

import core.basesyntax.Figure;

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
    public String draw() {
        return "Figure: square, area: " + getArea() + " sq.units, side A: "
                + sideA + " units, side B: " + sideB + " units, color: " + getColor();
    }
}

