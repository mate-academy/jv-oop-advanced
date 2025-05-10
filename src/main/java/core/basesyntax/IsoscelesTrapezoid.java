package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int bottom;
    private final int top;
    private final int side;

    public IsoscelesTrapezoid(Color color, int bottom, int top, int side) {
        super(Shape.ISOSCELES_TRAPEZOID, color);
        this.bottom = bottom;
        this.top = top;
        this.side = side;
    }

    public int getBottom() {
        return bottom;
    }

    public int getTop() {
        return top;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getShape() + ", area: " + getArea()
                + " sq.units, bottom side: " + bottom + " sq.units, top side: "
                + top + " sq.units, side: " + side
                + " sq.units, color: " + getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        double height = (double) (2 * this.getSide()) / (this.bottom + this.getTop());
        return (this.getBottom() + this.getTop() * height) / 2;
    }
}
