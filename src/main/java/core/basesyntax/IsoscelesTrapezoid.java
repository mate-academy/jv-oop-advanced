package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    public static final double CONST_FOR_TRAPEZOID = 2;
    private String color;
    private int lowerBase;
    private int upperBase;
    private int height;

    protected IsoscelesTrapezoid(String color, int lowerBase, int upperBase, int height) {
        this.color = color;
        this.lowerBase = lowerBase;
        this.upperBase = upperBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((double) this.lowerBase + (double) this.upperBase)
                / CONST_FOR_TRAPEZOID * (double) this.height;
    }

    @Override
    public void printFigure() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f,"
                        + " lower base: %d, upper base: %d, height: %d, color: %s.%n",
                this.getArea(), this.lowerBase, this.upperBase, this.height, this.color);

    }
}
