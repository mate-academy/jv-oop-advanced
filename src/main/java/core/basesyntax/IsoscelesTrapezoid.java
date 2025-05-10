package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base;
    private double top;
    private double height;

    public IsoscelesTrapezoid(double base, double top, double height, String color) {
        this.base = base;
        this.top = top;
        this.height = height;
        setColor(color);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " square units, base: " + base + " units, top: " + top
                + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    double calculateArea() {
        return 0.5 * (base + top) * height;
    }
}
