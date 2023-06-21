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
    public double area() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String info() {
        return "Figure: rightTriangle, area: " + area() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: "
                + getColor().name().toLowerCase();
    }
}
