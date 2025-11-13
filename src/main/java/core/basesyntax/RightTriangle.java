package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideA;
    private double sideB;
    private static final int NUMBER = 2;
    private final String name = "RightTriangle";

    public RightTriangle(double sideA, double sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB / NUMBER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, " + "firstLeg: " + sideA + " units, "
                + "secondLeg: " + sideB + " units, " + "color: " + color);
    }
}
