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
    public void draw() {
        System.out.println("Figure: RightTriangle, " + "area: " + getArea() + " sq. units, firstLeg: " + getFirstLeg() + ", secondLeg: " + getSecondLeg() + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
