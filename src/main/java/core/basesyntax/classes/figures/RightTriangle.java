package core.basesyntax.classes.figures;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.sideA = firstLeg;
        this.sideB = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (double) (this.sideA * this.sideB) / 2;
    }

    @Override
    public void drawData() {
        System.out.printf("Figure: right triangle, area: %.1f sq. units, firstLeg: %d units, "
                + "secondLeg: %d units, color: %s%n", this.calculateArea(),
                sideA, sideB, super.getColor());
    }
}
