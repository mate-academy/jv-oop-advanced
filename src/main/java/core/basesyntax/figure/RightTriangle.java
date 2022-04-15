package core.basesyntax.figure;

import core.basesyntax.supplier.FigureType;

public class RightTriangle extends Figure {
    private static final double NUMBER = 2.0;
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double getSideA, double getSideB) {
        super(color);
        this.sideA = getSideA;
        this.sideB = getSideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double area = getSideA() * getSideB() / NUMBER;
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + FigureType.RIGHT_TRIANGLE + ", area: "
                + String.format("%.2f", getArea()) + " sq.units, sideA: "
                + getSideA() + " units, sideB: " + getSideB() + " units, color: " + getColor());
    }
}
