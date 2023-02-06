package core.basesyntax.figure;

public class RightTriangle extends AbstractFigure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %.2f sq.units, "
                        + "firstLeg: %d units, secondLeg: %d units, color: %s%n",
                getArea(), firstLeg, secondLeg, getColor().toLowerCase());
    }
}
