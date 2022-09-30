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
    public double getArea() {
        return height * ((top * bottom) / 2);
    }

    @Override
    public String draw() {
        return ("Figure: Isosceles Trapezoid, area: " + getArea() + " sq.units, top: "
                + top + " units, bottom: " + bottom + " units, height: "
                + height + " units, color: " + getColor());

    }
}
