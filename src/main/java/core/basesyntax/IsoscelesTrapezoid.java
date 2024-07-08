package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double high;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double high, Color color) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.high = high;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getHigh() {
        return high;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (getFirstLeg() * getSecondLeg() * getHigh()) / 2;
    }

    @Override
    public void draw() {
        System.out.println(String.format("IsoscelesTrapezoid with area: %.2f sq. units, "
                + "firstLeg: %.2f units, secondLeg: %.2f units, high: %.2f units, "
                + "color: %s", getArea(), getFirstLeg(), getSecondLeg(), getHigh(), getColor()));
    }
}
