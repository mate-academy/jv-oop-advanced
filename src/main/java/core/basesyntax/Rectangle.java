package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, InfoBox {
    private double sideA;
    private double sideB;

    // CONSTRUCTORS
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    // GETTERS & SETTERS
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

    // BODY
    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area: " + getArea() + " sq.units, side A: " + sideA
                + " units, side B: " + sideB + "units, color: " + getColor());
    }
}
