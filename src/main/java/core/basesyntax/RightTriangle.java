package core.basesyntax;

public class RightTriangle extends Figure {
    private float sideA;
    private float sideB;

    public RightTriangle(float sideA, float sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: right triangle, area: %.2f sq.units, sideA:"
                        + " %.2f units, sideB: %.2f units, color: %s\n",
                getArea(), sideA, sideB, getColor());
    }
}
