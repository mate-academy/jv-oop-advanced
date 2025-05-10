package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int top;
    private int bottom;

    public IsoscelesTrapezoid(int sides, int top, int bottom, String color) {
        super(color);
        this.side = sides;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return side * side * top * bottom;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: " + getArea() + "sq. units, sides: "
                + side + " units, top side: " + top + " units, Bottom side: " + bottom
                + " units, color: " + getColor());
    }
}
