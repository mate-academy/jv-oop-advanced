package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (int)(firstLeg * secondLeg * 0.5 * 1000) / 1000.0;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, "
                + "area: " + calculateArea() + " sq.unit, "
                + "sides: " + firstLeg + " " + secondLeg + " units, "
                + "color: " + getColor().name().toLowerCase();
    }
}
