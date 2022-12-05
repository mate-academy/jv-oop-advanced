package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double thirdLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.thirdLeg = thirdLeg;
    }

    @Override
    public double area() {
        return (firstLeg + secondLeg) / 2 * thirdLeg;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + area() + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, thirdLeg: " + thirdLeg + secondLeg
                + " units, color: " + getColor();
    }
}
