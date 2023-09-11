package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int areaCalculation() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void ableToDraw() {
        System.out.println("Figure: right triangle, area: " + areaCalculation()
                + " sq.units, first leg: " + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + color.name());
    }
}
