package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double trapezoidHeight;

    public IsoscelesTrapezoid(String color, double firstBase,
            double secondBase, double trapezoidHeight) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.trapezoidHeight = trapezoidHeight;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * 0.5 * trapezoidHeight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid" + ", "
                + "area: " + getArea() + " sq. units" + ", "
                + " firstBase: " + firstBase + " units" + ", "
                + " secondBase: " + secondBase + " units" + ", "
                + " trapezoidHeight: " + trapezoidHeight + " units" + ", "
                + " color: " + getColor());
    }
}
