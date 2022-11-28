package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String TEMPLATE = "Figure: isosceles trapezoid, area: %.1f sq.units,"
            + " base: %d units, top: %d units, leg: %d units, color: %s";
    private int base;
    private int top;
    private int leg;

    public IsoscelesTrapezoid(String color, int base, int top, int leg) {
        super(color);
        this.base = base;
        this.top = top;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        double s = getSemiPerimeter();
        return Math.sqrt((s - base) * (s - top) * (s - leg) * (s - leg));
    }

    private double getSemiPerimeter() {
        return (base + top + leg + leg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format(TEMPLATE, getArea(), base, top, leg, getColor()));
    }
}
