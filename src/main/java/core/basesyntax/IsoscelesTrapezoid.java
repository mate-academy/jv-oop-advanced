package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    int base;
    int top;
    int height;

    public IsoscelesTrapezoid(int base, int top, int height) {
        this.base = base;
        this.top = top;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid" + ", area: "
                + getArea()
                + " sq.units, base: " + base
                + " units, top: " + top
                + ", height: " + height
                + ", color: " + color);
    }

    @Override
    public String getArea() {
        return String.format("%.1f", (double) (base + top) / 2 * height);
    }
}
