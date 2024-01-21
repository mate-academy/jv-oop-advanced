package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int firstLeg;
    private int secondLeg;
    private int high;

    public IsoscelesTrapezoid(String color, int firstLeg,int secondLeg, int high) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.high = high;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * high;
    }

    @Override
    public String draw() {
        return "Figure: Isosceles Trapezoid, area: " + getArea() + "sq. units, firstLeg:"
                + firstLeg + " units, secondLeg: " + secondLeg + " units, high: " + high
                + " units, color: " + getColor();
    }
}
