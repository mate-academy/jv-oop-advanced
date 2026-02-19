package core.basesyntax;
public class IsoscelesTrapezoid extends AbstractFigure implements Figure, Drawable {
    private static final double DIVIDER = 2.0;
    private double up;
    private double low;
    private double height;
    public IsoscelesTrapezoid(String color, int up, int low, int height) {
        super(color);
        this.up = up;
        this.low = low;
        this.height = height;
    }
    @Override
    public double area() {
        return (up + low) / DIVIDER * height;
    }
    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + area() +
                        " sq. units, up: " + up +
                        " units, low: " + low +
                        " units, height: " + height +
                        " units, color: " + getColor()
        );
    }
}
