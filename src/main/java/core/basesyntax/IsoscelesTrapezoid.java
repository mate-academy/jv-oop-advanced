package core.basesyntax;

public class IsoscelesTrapezoid extends FigureBase {

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
    public double getArea() {
        return 0.5 * (bottom + top) * height;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: "
                        + getArea()
                        + " sq. units, base1: "
                        + top
                        + " units, base2: "
                        + bottom
                        + " units, height: "
                        + height
                        + " units, color: "
                        + color);
    }
}
