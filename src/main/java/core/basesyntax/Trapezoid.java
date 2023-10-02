package core.basesyntax;

public class Trapezoid extends Figure {
    private final int top;
    private final int bottom;
    private final int height;

    public Trapezoid(int top, int bottom, int height, String color) {
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
        return "Figure : trapezoid, " + "area :"
                + getArea() + "sq.units, "
                + top + "units, "
                + bottom + "units, "
                + height + "units, "
                + "color :" + super.getColor().toLowerCase();
    }
}
