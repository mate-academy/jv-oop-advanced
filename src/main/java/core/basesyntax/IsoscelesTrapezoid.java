package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(int top, int bottom, int height, Color color) {
        super(color);
        this.height = height;
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, Area: " + getArea()
                + " sq. units, Top: " + top + " Bottom: " + bottom
                + " Height: " + height 
                + " units, Color: " + getColor());
    }
}
