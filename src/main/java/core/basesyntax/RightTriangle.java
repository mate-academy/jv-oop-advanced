package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area:" + getArea()
                + " sq. units, sideA: " + getSideA()
                + " units, sideB: " + getSideB()
                + " units, color: " + getColor());
    }
}
