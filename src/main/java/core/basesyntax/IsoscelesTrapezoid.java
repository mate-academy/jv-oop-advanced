package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double DENOMINATOR = 2.0;
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int base, int top, int height) {
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height / DENOMINATOR * (base + top);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, base: " + base + " units, top: " + top
                + " units, height: " + height + " units, color: " + getColor());
    }
}
