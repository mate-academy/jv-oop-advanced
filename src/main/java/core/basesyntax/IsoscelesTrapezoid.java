package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sides;
    private int top;
    private int bottom;

    public IsoscelesTrapezoid(int sides, int top, int bottom, String color) {
        super(color);
        this.sides = sides;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return sides * sides * top * bottom;
    }

    @Override
    public String draw() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea() + "sq. units, sides: " + sides
                + " units, top side: " + top + " units, Bottom side: " + bottom
                + " units, color: " + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
