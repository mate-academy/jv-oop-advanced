package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;

public class Rectangle extends Figure implements AreaCalculator {
    private static final String TYPE_FIGURE = "RECTANGLE";
    private double sideA;
    private double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
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
        double area = getSideA() * getSideB();
        return area;
    }

    @Override
    public void print() {
        System.out.println("Figure: " + TYPE_FIGURE + ", area: " + String.format("%.2f", area())
                + " sq.units, sideA: " + getSideA() + " units, sideB: "
                + getSideB() + " units, color: " + getColor());
    }
}
