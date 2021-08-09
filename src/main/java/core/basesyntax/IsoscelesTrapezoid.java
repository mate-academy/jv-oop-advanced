package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int base, int top, int height, String color) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, base: " + getBase()
                + " units, top: " + getTop()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (double) (base + top) / 2 * height;
    }
}
