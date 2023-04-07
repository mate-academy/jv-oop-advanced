package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int high;

    public IsoscelesTrapezoid(int top, int bottom, int high, Color color) {
        super(color);
        this.high = high;
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, Area: " + getArea()
                + " sq. units, Top: " + top + " Bottom: " + bottom
                + " High: " + high 
                + " units, Color: " + getColor());
    }
}
