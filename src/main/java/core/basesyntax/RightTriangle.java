package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double obtainArea() {
        return (double) (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: "
                + obtainArea() + " sq. units, first leg: "
                + getFirstLeg() + " units, second leg: "
                + getSecondLeg() + " units, color:"
                + getColor());
    }
}
