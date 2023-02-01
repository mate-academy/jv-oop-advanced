package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle,"
                + " area: " + getArea() + " sq.units," + " firstLeg: "
                + sideA + " units," + " secondLeg: "
                + sideB + " units," + " color: " + color);
    }
}
