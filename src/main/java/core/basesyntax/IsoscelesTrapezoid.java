package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(String color, int base, int top, int height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * height * (base + top);
    }

    public void drawInfo() {
        System.out.print("Figure: isosceles trapezoid, area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, base: " + base + " units, top: "
                + top + " units, height: " + height + " units, color: " + getColor());
    }
}
