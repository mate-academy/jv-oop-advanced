package core.basesyntax;

public class Rectangle extends Figure {

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
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.1f sq. units, perimeter: %.1f units, "
                        + "sideA: %.1f units, sideB: %.1f units, color: %s%n", getArea(),
                getPerimeter(), getSideA(), getSideB(), getColor());
    }
}
