package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    public IsoscelesTrapezoid(String color, int height, int bottom, int top) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return (top + bottom) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq. units, side %d units, color: %s%n",
                calculateArea(), top, bottom, height, color
        );
    }
}
