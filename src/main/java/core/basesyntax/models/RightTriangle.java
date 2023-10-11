package core.basesyntax.models;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(String color, double firstLeg, double secondLeg, double area) {
        super(color, area);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double obtainArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", firstLeg: "
                + firstLeg + " units, secondLeg: "
                + secondLeg + " units, color: "
                + getColor();
    }

    @Override
    public String draw(Object o) {
        return o.toString();
    }
}
