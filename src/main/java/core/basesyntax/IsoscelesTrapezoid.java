package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private static final double POINT_FIVE = 0.5;
    private String color;
    private double height;
    private double top;
    private double bottom;

    public IsoscelesTrapezoid(double bottom, double height, double top, String color) {
        this.color = color;
        this.height = height;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return (top + bottom) * POINT_FIVE * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq.units, top: %.2f units, bottom: %.2f units, height: %.2f units, color: %s\n", getArea(), top, bottom, height, color);
    }
}
