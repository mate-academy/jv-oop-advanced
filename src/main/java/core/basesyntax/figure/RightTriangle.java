package core.basesyntax.figure;

import core.basesyntax.template.Figure;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area:" + getArea()
                + " sq. units, sideA: " + getSideA()
                + " units, sideB: " + getSideB()
                + " units, color: " + getColor());
    }
}
