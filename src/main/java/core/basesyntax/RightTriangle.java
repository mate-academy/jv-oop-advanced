package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawing {
    private double sideA;
    private double sideB;

    public RightTriangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    public double getA() {
        return Math.sqrt(Math.pow(sideA,2)+Math.pow(sideB,2));
    }

    public void setA(double a) {
        this.sideA = sideA;
    }

    public double getB() {
        return sideB;
    }

    public void setB(double b) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + sideA +
                ", b=" + sideB +
                ", color='" + color + '\'' +
                '}';
    }
}
