package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int bottom;
    private int top;
    private int height;

    public IsoscelesTrapezoid(String color, int bottom, int top, int height) {
        this.color = color;
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (top + bottom) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, top: " + top
                + " units, bottom: " + bottom
                + " units, height: " + height
                + " units, color: " + color.toLowerCase());
    }
}
