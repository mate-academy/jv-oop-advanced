package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;

    public RightTriangle(double sideA, double sideB, Color color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea()
                + " sq.units, side a: " + sideA + "units, side b: "
                + sideB + " units, color: " + getColor());
    }
}
