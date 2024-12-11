package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Colors color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (getFirstLeg() * getSecondLeg()) / 2;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + getArea()
                + "firstLeg: " + getFirstLeg()
                + "secondLeg: " + getSecondLeg() + "color: " + getColor();
    }
}
