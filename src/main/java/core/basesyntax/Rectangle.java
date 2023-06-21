package core.basesyntax;

public class Rectangle extends Square {
    protected double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(sideA, color);
        this.sideB = sideB;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle sideB=" + sideB + ", sideA=" + sideA + ", color=" + color + ", area=" + area;
    }
}
