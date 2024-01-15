package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units,"
                + " height: " + height + " units,"
                + " firstBase: " + firstBase + " units,"
                + " secondBase: " + secondBase + " units,"
                + " color: " + color);
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * 0.5 * height;
    }
}
