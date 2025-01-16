package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double base;
    private final double top;
    private final double height;

    public IsoscelesTrapezoid(String color, double base, double top, double height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq. units, base: " + String.format("%.2f", base)
                + " units, top: " + String.format("%.2f", top)
                + " units, height: " + String.format("%.2f", height) + " units, color: " + super.color);
    }

    @Override
    public double getArea() {
        return 0.5 * (base + top) * height;
    }
}
