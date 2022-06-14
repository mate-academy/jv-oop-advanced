package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private final int top;
    private final int bottom;
    private final int height;

    public IsoscelesTrapezoid(int top, int bottom, int height) {
        super.setColor();
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }
    @Override
    public double getArea() {
        return ((top + bottom) / 2.0) * height;
    }

    @Override
    public String toString() {
        return "Figure: trapezoid, " +
                "area: " + getArea() +" sq.units, "+
                "top: " + top + " units, " +
                "bottom: " + bottom + " units, " +
                "height: " + height + " units, " +
                "color: " + super.getColor().toLowerCase();
    }
}
