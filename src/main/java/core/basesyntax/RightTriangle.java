package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    void draw() {
        System.out.println(String.format("Figure: right rectangle, area: %.2f sq.units, first leg: %.2f units, second leg: %.2f units, color: %s"
                , getArea(), firstLeg, secondLeg, getColor()));
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }


}
