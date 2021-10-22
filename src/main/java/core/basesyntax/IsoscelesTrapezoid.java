package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int down;
    private int height;

    public IsoscelesTrapezoid(String color, int top, int down, int height) {
        super(color);
        this.top = top;
        this.down = down;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((top + down) / 2) * height;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units"
                + ", topSide: " + top + " units"
                + ", downSide: " + down + " units"
                + ", height: " + height + " units"
                + ", color: " + getColor());
    }
}
