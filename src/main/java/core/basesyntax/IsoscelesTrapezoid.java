package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int base;
    private int top;
    private int height;

    public IsoscelesTrapezoid(int base, int top, int height, Color color) {
        this.base = base;
        this.top = top;
        this.height = height;
        super.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid, color: " + color.toString()
                + ", base: " + base
                + ", top: " + top
                + ", height: " + height
                + ", area: " + getArea() + " sq.units.");
    }

    @Override
    public double getArea() {
        return (double) height / 2 * base + (double) height / 2 * top;
    }
}
