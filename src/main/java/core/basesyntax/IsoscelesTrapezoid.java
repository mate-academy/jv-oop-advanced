package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int height;

    public IsoscelesTrapezoid(String color, int bottom, int top, int height) {
        super(color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (bottom + top) * height;
    }

    @Override
    public void draw() {
        String string = String.format("Figure: Isosceles Trapezoid, area: %,.2f sq. units, "
                + "bottom: %d units, top: %d units, height: %d units, "
                + "color: %s", getArea(), bottom, top, height, getColor());
        System.out.println(string);
    }
}

