package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getSideA() {
        return firstLeg;
    }

    public double getSideB() {
        return secondLeg;
    }

    public void setSideA(double sideA) {
        this.firstLeg = sideA;
    }

    public void setSideB(double sideB) {
        this.secondLeg = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea() + " sq.units, sideA: "
                + getSideA() + "sideB: " + getSideB() + " sq.units, Color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
