package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private static final int AVERAGE_BASE_DIVISOR = 2;

    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase,
                              double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / AVERAGE_BASE_DIVISOR * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + ", color: " + getColor()
                + ", first base: " + firstBase
                + ", second base: " + secondBase
                + ", height: " + height);
    }
}
