package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super.setColor(color);
        super.setType("right triangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public RightTriangle setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
        return this;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public RightTriangle setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
        return this;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void getInfo() {
        System.out.printf("Figure: %s, area: %s sq.units, first leg:"
                        + " %s units, second leg: %s units, color: %s%n",
                getType(), getArea(), firstLeg, secondLeg, getColor());
    }
}
