package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(int height, int top, int bottom, String color) {
        this.height = height;
        this.top = top;
        this.bottom = bottom;
        setColor(color);
    }

    @Override
    public double getArea() {
        return height * (top + bottom) / 2;
    }

    public String draw() {
        return "isosceles trapezoid, area: " + getArea()
            + " sq.units, height: " + height + " units, top: " + top + " units, bottom: "
            + bottom + " units, color: " + getColor().toLowerCase();
    }
}
