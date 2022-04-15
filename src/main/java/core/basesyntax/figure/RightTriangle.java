package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;

public class RightTriangle extends Figure implements AreaCalculator {
    private static final String TYPE_FIGURE = "RIGHT_TRIANGLE";
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
    public double area() {
        double area = getSideA() * getSideB() / NUMBER;
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + TYPE_FIGURE + ", area: " + String.format("%.2f", area())
                + " sq.units, sideA: " + getSideA() + " units, sideB: "
                + getSideB() + " units, color: " + getColor());
    }
}
