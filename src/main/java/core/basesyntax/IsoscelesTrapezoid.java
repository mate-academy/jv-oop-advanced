package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int height;
    private int top;

    public IsoscelesTrapezoid(String color, int base, int height, int top) {
        super(color);
        this.base = base;
        this.height = height;
        this.top = top;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public double getArea() {
        return (double) height / 2 * (top + base);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, base: " + getBase() + " units, height: "
                + getHeight() + " units, top: " + getTop()
                + " units, color: " + getColor());
    }
}
