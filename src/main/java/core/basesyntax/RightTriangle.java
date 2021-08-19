package core.basesyntax;

public class RightTriangle extends Figure {
    private int sideA;
    private int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle,"
                + " area: " + getArea() + " sq.units"
                + ", sideA: " + sideA
                + ", sideB: " + sideB
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * sideA * sideB;
    }
}
