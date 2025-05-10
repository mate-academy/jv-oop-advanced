package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(String color, int top, int bottom, int height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea() + " sq.units, top: "
                + top + " units, bottom: " + bottom + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (double) (top + bottom) / 2 * height;
    }
}
