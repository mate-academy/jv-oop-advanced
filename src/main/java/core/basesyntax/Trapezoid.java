package core.basesyntax;

public class Trapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public Trapezoid(int top, int bottom, int sides, Color color) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = sides;
    }

    @Override
    public int getArea() {
        return ((top + bottom) / 2) * height;
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + " trapezoid with height " + height
                + ", parallel sides " + bottom + " and " + bottom + " and area of " + getArea());
    }
}
