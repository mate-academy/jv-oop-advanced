package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double height;
    private final double firstBase;
    private final double secondBase;

    public IsoscelesTrapezoid(String color, double height, double firstBase, double secondBase) {
        super.setColor(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        super.setArea(calculateArea());
    }

    @Override
    public double calculateArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square,"
                        + " area: %.1f sq. units,"
                        + " height: %.1f sq. units,"
                        + " firstParallel: %.1f sq. units,"
                        + " secondParallel: %.1f sq. units,"
                        + " color: %s\n",
                calculateArea(), height, firstBase, secondBase, getColor());
    }
}
