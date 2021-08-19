package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        String information = String.format("Figure: right triangle, area: %,.2f sq.units,"
                        + " %d units, %d units, color: %s",
                        getArea(), firstLeg, secondLeg, getColor());
        System.out.println(information);
    }
}
