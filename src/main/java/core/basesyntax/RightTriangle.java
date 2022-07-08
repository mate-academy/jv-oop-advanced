package core.basesyntax;

public class RightTriangle extends Figure implements Area {
    private double firstLeg;
    private double secondLeg;

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
    public double getArea() {
        return 0.5 * (firstLeg * secondLeg);
    }
}
