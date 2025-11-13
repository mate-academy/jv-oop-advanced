package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;
    private final String name = "RightTriangle";

    public RightTriangle(double sideA, double sideB, String kolor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.kolor = kolor;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, " + "firstLeg: " + sideA + " units, "
                + "secondLeg: " + sideB + " units, " + "color: " + kolor);
    }
}
