package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private int upperbase;
    private int lowerbase;
    private int trapezoidheight;
    private String colour;

    public IsoscelesTrapezoid(int upperbase, int lowerbase, int trapezoidheight, String colour) {
        this.upperbase = upperbase;
        this.lowerbase = lowerbase;
        this.trapezoidheight = trapezoidheight;
        this.setColour(colour);
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
