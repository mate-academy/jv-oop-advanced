package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double secondLeg, double firstLeg) {
        super(color);
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
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "Figure: rightTriangle, area: "
                + getArea() + " sq. units, firstLeg: "
                + getFirstLeg() + " units, b: "
                + getSecondLeg() + " units, color: " + getColor();
    }
}
