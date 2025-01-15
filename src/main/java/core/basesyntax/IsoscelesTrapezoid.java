package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(String color, double base, double top, double height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base + top) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + roundToTwoDecimals(getArea())
                + " sq. units, base: " + roundToTwoDecimals(base)
                + " units, top: " + roundToTwoDecimals(top)
                + " units, height: " + roundToTwoDecimals(height) + " units, color: " + color);
    }
}
