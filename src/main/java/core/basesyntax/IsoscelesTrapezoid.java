package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double AREA_DIVIDER = 2.0;
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / AREA_DIVIDER;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstBase: " + firstBase
                + " units, secondBase: " + secondBase
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
