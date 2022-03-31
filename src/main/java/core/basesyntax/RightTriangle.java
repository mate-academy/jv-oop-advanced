package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public String draw() {
        return "figure: right triangle, area: "
                + getArea() + " sq.units, firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor().toString().toLowerCase();
    }
}
