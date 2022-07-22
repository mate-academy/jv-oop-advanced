package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sides;
    private int top;
    private int bottom;

    public IsoscelesTrapezoid(int sides, int top, int bottom) {
        this.sides = sides;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public int getArea() {
        return sides * sides * top * bottom;
    }

    @Override
    public String draws() {
        return "Figure: IsoscelesTrapezoid, area: " + getArea() + "sq. units, sides: " + sides
                + " units, top side: " + top + " units, Bottom side: " + bottom
                + " units, color: " + new ColorSupplier().getRandomColor();
    }

    @Override
    public String toString() {
        return draws();
    }
}
