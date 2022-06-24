package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double K = 0.5;
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        this.color = color;
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getAreaCalculator() + " sq.units,"
                + " height: " + height + " units,"
                + " firstBase: " + firstBase + " units,"
                + " secondBase: " + secondBase + " units,"
                + " color: " + color);
    }

    @Override
    public double getAreaCalculator() {
        return (firstBase + secondBase) * K * height;
    }
}
