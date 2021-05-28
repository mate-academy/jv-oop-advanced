package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
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
    public String toString() {
        return "Rectangle{" +
                "area=" + getArea() + " sq.units" +
                ", sideA=" + sideA + " units" +
                ", sideB=" + sideB + " units" +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
