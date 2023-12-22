package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = areaCalculator();
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double areaCalculator() {
        return this.area = (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right trianle, area: " + getArea() + " sq. units, first leg: "
                + getFirstLeg() + " units, second leg: "
                + getSecondLeg() + " units, color: "
                + getColor());
    }
}
