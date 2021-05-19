package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable {
    private final double base;
    private final double top;
    private final double height;

    public IsoscelesTrapezoid(String color, double base, double top, double height) {
        super(color);
        this.base = base;
        this.top = top;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getTop() {
        return top;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, top: "
                + getTop() + " units, base " + getBase()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return height / 2 * (base + top);
    }
}
