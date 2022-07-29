package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 1 / 2 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "right triangle, area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + ", color: " + getColor();
    }
}
