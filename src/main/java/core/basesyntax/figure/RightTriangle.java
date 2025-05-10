package core.basesyntax.figure;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int legA;
    private int legB;

    public RightTriangle(int legA, int legB, String name, String color) {
        super(color, name);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, leg a: " + legA
                + " units, leg b: " + legB
                + " units, color: " + getColor());
    }
}
