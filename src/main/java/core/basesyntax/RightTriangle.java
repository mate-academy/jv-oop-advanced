package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String printInfo() {
        return "Figure: right triangle, area: " + Math.floor(getArea() * 100) / 100
                + " sq.units, first leg: " + (int) getFirstLeg() + " units, second leg: "
                + (int) getSecondLeg() + ", color: " + getColor();
    }
}
