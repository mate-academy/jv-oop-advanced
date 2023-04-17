package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
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
    public String toString() {
        if (getArea() == 0) {
            return ("Right triangle`s area is 0");
        }
        return "Figure: triangle, "
                + "area : " + getArea()
                + " sq.units, "
                + " firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units" + " color:" + getColor();
    }

    @Override
    public double getArea() {
        double area = (firstLeg * secondLeg) / 2;
        return Math.round(area * 100) / 100;
    }
}
