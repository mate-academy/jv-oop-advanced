package core.basesyntax;

public class RightTriangle extends Figure {
    public static final double COEFFICIENT = 0.5;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color, String name) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        setColor(color);
        setName(name);
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
