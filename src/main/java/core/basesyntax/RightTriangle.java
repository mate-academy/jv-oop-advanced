package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: right triangle, area: "
                + calculateArea() + " sq.units, firstLeg and secondLeg: "
                + firstLeg + " and " + secondLeg
                + " units, color: " + getColor().name());
    }
}
