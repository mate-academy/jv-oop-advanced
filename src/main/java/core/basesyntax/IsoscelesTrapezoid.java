package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private int top;
    private int bottom;
    private int height;
    private String color;

    public IsoscelesTrapezoid() {
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (top + bottom) / 2 * height;
    }
}
