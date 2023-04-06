package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public RightTriangle(double sideA, double sideB, double sideC, String color) {
        super(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    @Override
    public double area() {
        double s;
        s = ((getSideA() * getSideB()) / 2);
        return s;
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
    public String draw() {
        return "Figure: " + getName() + ", area: " + area()
                + " units, sides: " + getSideA() + "," + getSideB() + ","
                + getSideC() + " units, color: " + getColor();
    }
}
