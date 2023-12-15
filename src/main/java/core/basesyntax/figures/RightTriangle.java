package core.basesyntax.figures;

import static core.basesyntax.utils.NumberRounder.round;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super("right triangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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

    @Override
    public String getInfo() {
        return super.getInfo()
                + ", 1st leg: " + round(firstLeg) + " units"
                + ", 2nd leg: " + round(secondLeg) + " units";
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
