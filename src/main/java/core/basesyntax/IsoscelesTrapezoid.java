package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int top;
    private final int bottom;
    private final int height;

    public IsoscelesTrapezoid(int top, int bottom, int height, String color) {
        super.setColor(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((bottom + top) / 2.0) * height;
    }

    @Override
    public String draw() {
        return "Figure : trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "top: " + top + " units, "
                + "bottom: " + bottom + " units, "
                + "height: " + height + " units, "
                + "color: " + super.getColor().toLowerCase();
    }
}
