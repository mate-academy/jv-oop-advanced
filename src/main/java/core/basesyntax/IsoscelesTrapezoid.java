package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int base;
    private int top;

    public IsoscelesTrapezoid(String color, int height, int base, int top) {
        super(color);
        this.height = height;
        this.base = base;
        this.top = top;
    }

    @Override
    public double getArea() {
        return ((base + top) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + "sq.units, height: "
                + height + " units, base: " + base + " units, top: " + top + " units, color: "
                + getColor());
    }
}
