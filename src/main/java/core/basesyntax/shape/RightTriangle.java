package core.basesyntax.shape;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB) {
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return (double) ((legA * legB) / 2);
    }

    @Override
    public String draw() {
        return "Shape: right triangle; area: " + getArea() + "; side, leg A: " + legA
                + ", leg B: " + legB + "; color: " + getColor();
    }
}
