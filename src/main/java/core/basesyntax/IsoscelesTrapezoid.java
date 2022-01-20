package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int top;
    private int base;

    public IsoscelesTrapezoid(String color, int height, int top, int base) {
        super(color);
        this.height = height;
        this.top = top;
        this.base = base;
    }

    public int getTop() {
        return top;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return height / 2 * (base + top);
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid {height="
                + height + ", top=" + top
                + ", base=" + base + ", color is " + this.getColor() + "}";
    }
}
