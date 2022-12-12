package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawTheFigure() {
        System.out.printf("Figure: right triangle, area: %.1f sq.units,"
                        + " firstLeg: %d units, secondLeg: %d units, color: %s%n",
                calculateArea(), firstLeg, secondLeg, getColor().toLowerCase());
    }
}
