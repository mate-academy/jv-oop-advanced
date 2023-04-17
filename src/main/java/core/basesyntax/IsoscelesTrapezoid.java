package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double high;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double high) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.high = high;
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

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        if (getArea() == 0) {
            return ("Isosceles trapezoid`s area is 0");
        }
        return "Figure: isosceles trapezoid, "
                + "area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, " + "high: " + high
                + " units, " + "color: " + getColor();
    }

    @Override
    public double getArea() {
        double area = (firstLeg + secondLeg) / 2 * high;
        return Math.round(area * 100) / 100;
    }
}
