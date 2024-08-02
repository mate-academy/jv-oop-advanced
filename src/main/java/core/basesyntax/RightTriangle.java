package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculetion {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color, String name) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return getFirstLeg() * getSecondLeg() * COEFFICIENT;
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units, first leg: "
                + getFirstLeg() + " units, second leg: " + getSecondLeg() + " units, color: "
                + getColor();
    }
}
