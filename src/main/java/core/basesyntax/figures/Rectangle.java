package core.basesyntax.figures;

import core.basesyntax.util.Figure;

public class Rectangle extends Figure {
    private Double sideA;
    private Double sideB;

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + ", sideA: " + getSideA()
                + ", sideB: " + getSideB() + ", color: " + getColor());
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }
}
