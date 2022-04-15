package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private static final String TYPE_FIGURE = "ISOSCELES_TRAPEZOID";
    private static final double NUMBER = 2.0;
    private double sideA;
    private double sideB;
    private double trapezoidHeight;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double trapezoidHeight) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.trapezoidHeight = trapezoidHeight;
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

    public double getTrapezoidHeight() {
        return trapezoidHeight;
    }

    public void setTrapezoidHeight(double trapezoidHeight) {
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double area() {
        double area = (getSideA() + getSideB()) / NUMBER * getTrapezoidHeight();
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + TYPE_FIGURE + ", area: " + String.format("%.2f", area())
                + " sq.units, trapezoid height: " + getTrapezoidHeight() + " ,sideA: "
                + getSideA() + " units, sideB: " + getSideB() + " units, color: " + getColor());
    }
}
