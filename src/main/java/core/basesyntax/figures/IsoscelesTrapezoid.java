package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private final int side;
    private final int above;
    private final int bottom;

    public IsoscelesTrapezoid(int side, int above, int bottom, String color) {
        super(color);
        this.side = side;
        this.above = above;
        this.bottom = bottom;
    }

    @Override
    public int getArea() {
        return side + above + bottom;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + this.getArea() + " side: "
                + this.side + " units, above: " + this.above + " units, bottom: "
                + this.bottom + " units, color: " + this.getColor());
    }
}
