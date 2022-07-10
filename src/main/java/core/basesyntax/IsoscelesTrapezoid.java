package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private final int firstBase;
    private final int secondBase;
    private final int trapezoidHeight;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int trapezoidHeight) {
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
