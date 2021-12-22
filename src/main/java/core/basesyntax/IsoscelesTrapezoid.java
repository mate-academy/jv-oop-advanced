package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int upperbase;
    private final int lowerbase;
    private final int trapezoidheight;

    public IsoscelesTrapezoid(int upperbase, int lowerbase, int trapezoidheight, String colour) {
        this.upperbase = upperbase;
        this.lowerbase = lowerbase;
        this.trapezoidheight = trapezoidheight;
        setColour(colour);
    }

    @Override
    public double getArea() {
        return 0.5 * (upperbase + lowerbase) * trapezoidheight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelestrapezoid, " + "area: " + getArea()
                + " sq.units, " + "upperbase: " + upperbase + " units, "
                + "lowerbase: " + lowerbase + " units, " + "trapezoidheight: "
                + trapezoidheight + " units, " + "color: " + getColour());
    }
}
