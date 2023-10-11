package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

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
    public String draw() {
        return "Figure: right triangle, area: " + areaCalculator()
                + " sq.units, first leg: " + this.firstLeg
                + " units, second leg: " + this.secondLeg
                + " units, color: " + this.color;
    }

    @Override
    public int areaCalculator() {
        return this.firstLeg * this.secondLeg / 2;
    }
}
