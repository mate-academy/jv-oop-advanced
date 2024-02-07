package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double top;
    private final double bottom;
    private final double height;

    public IsoscelesTrapezoid(String color, double top, double bottom, double height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: isosceles trapezoid; "
                        + "Top: %.2f, Bottom: %.2f, Height: %.2f, Area: %.2f; Color: %s\n",
                top, bottom, height, getArea(), getColor()
        );
    }

    @Override
    public double getArea() {
        return ((top + bottom) / 2) * height;
    }
}
