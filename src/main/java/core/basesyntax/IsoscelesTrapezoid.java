package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(Color color, int top, int bottom, int height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top: " + top
                + " units, bottom: " + bottom
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((double)(top + bottom) / 2) * height;
    }
}
