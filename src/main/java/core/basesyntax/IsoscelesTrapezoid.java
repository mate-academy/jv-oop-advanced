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
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * thirdLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + " firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, "
                + "thirdLeg: " + thirdLeg + secondLeg + " units, color: " + getColor());
    }
}
