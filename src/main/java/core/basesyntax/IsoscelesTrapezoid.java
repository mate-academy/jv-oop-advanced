package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private float sideA;
    private float sideB;
    private float height;

    public IsoscelesTrapezoid(float sideA, float sideB, float height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (sideA + sideB) / 2 * height;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq.units, sideA: %.2f units,"
                + " sideB: %.2f units, color: %s\n", getArea(), sideA, sideB, getColor());
    }
}
