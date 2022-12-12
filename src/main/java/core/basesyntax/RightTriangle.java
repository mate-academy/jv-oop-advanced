package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String getInfo() {
        return "Figure: RightTriangle area: " + getArea() + " sq.units "
                + "firstLeg: " + firstLeg + " secondLeg: " + secondLeg + " color: " + getColor();
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
