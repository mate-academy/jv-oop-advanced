package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: triangle, area: "
                + this.getArea() + " sq.units, first leg: "
                + this.firstLeg + " units, second leg: "
                + this.secondLeg + " units, color: "
                + this.getColor();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
