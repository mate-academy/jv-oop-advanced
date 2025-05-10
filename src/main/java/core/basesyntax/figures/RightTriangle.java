package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: right triangle, area: %1$.2f sq.units, "
                        + "first leg: %2$d units, second leg: %3$d units, color: %4$s%n",
                this.getArea(), firstLeg, secondLeg, this.getColor());
    }
}
