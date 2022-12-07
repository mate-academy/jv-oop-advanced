package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int side = 5;
    private int above = 9;
    private int bottom = 10;

    @Override
    public int area() {
        return side + above + bottom;
    }

    @Override
    public void print() {
        System.out.println("Figure: isoscelesTrapezoid, area: " + this.area() + " side: "
                + this.side + " units, above: " + this.above + "units, bottom: "
                + this.bottom + " units, color: " + this.getColor());
    }
}
