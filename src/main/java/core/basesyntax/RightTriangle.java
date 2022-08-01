package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(Color.valueOf(color.toString()));
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }
}
