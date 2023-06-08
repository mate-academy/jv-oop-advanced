package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstLeg: %.1f units,"
                        + "secondLeg: %.1f units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstLeg, secondLeg, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
