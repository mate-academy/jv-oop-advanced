package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public RightTriangle(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        if (sideA == sideB) {
            return (sideA * sideB) / 2;
        }
        if (sideA == sideC) {
            return (sideA * sideC) / 2;
        }
        return (sideB * sideC) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: "
                + getArea() + " sq.units, sideA: "
                + getSideA() + " units, sideB: "
                + getSideB() + " units, getSideC"
                + getSideC() + " color: "
                + getColor());
    }
}
