package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double rightSide;
    private double leftSide;
    private double height;

    public IsoscelesTrapezoid(double rightSide, double leftSide, double height) {
        super();
        this.rightSide = rightSide;
        this.leftSide = leftSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: trapezoid, area: %.1f sq.units,"
                + " rightSide: %.1f units, leftSide: %.1f units,"
                + " height: %.1f color: %s",
                area(), rightSide, leftSide, height, color.toLowerCase());
    }

    @Override
    public double area() {
        return (rightSide + leftSide) / 2 * height;
    }
}
