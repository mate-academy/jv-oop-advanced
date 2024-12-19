package core.basesyntax.classes.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (double) (this.firstLeg * this.secondLeg) / 2;
    }

    @Override
    public void drawData() {
        System.out.printf("Figure: right triangle, area: %.1f sq. units, firstLeg: %d units, "
                + "secondLeg: %d units, color: %s%n", this.calculateArea(),
                firstLeg, secondLeg, super.getColor());
    }
}
