package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, Drawable {
    private double top;
    private double bottom;
    private double high;

    public IsoscelesTrapezoid(double top, double bottom, double high, String color) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.high = high;
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, top: "
                + top + " units, bottom: "
                + bottom + " units, high: "
                + high + " units, color: " + color);

    }
}
