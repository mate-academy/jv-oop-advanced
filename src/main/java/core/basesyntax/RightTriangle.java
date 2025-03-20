package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq. units, firstLeg: %s units, secondLeg: %s units,"
                + " color: %s%n", "right triangle", this.getArea(), this.firstLeg, this.secondLeg,
                this.getColor());
    }
}
