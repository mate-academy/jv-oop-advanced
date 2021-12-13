package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int height;

    public IsoscelesTrapezoid(String color, int bottom, int top, int height) {
        super(color);
        this.bottom = bottom;
        this.top = top;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((bottom + top) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units, "
                + "bottom: " + bottom + " units, "
                + "top : " + top + " units, "
                + "height : " + height + " units, "
                + "color: " + super.getColor());
    }
}
