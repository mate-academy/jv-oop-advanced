package core.basesyntax;

public class RightTriangle extends Figure {
    private final String name = "right triangle";
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
        return this.firstLeg * this.secondLeg * 0.5;
    }

    @Override
    public void draw() {
        String out = String.format("Figure: right triangle, area: %,.2f sq.units,"
                        + " %d units, %d units, color: %s",
                        getArea(), this.firstLeg, this.secondLeg, getColor());
        System.out.println(out);
    }
}
