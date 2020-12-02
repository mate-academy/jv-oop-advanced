package core.basesyntax.shape;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String draw() {
        return "Shape: rectangle; area: " + getArea() + "; sideA: " + sideA
                + ", sideB: " + sideB + "; color: " + getColor();
    }
}
