package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double high;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double high, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.high = high;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg + secondLeg) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + " " + "Isosceles Trapezoid" + " " + "FirstLeg" + " " + firstLeg + " "
                + "SecondLeg" + " " + secondLeg + " " + "High" + " " + high + " "
                + "Area" + " " + getArea() + " " + "Color" + " " + color);
    }
}
