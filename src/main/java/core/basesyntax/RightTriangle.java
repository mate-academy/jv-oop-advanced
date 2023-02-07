package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String name = "right triangle";
    private final double leg1;
    private final double leg2;

    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    public RightTriangle(double leg1, double leg2, Colors color) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        setColor(color);
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    @Override
    public double getArea() {
        return Math.round(leg1 * leg2 / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + ", leg1: "
                + getLeg2() + ", leg2: " + getLeg2() + ", color: " + getColor());
    }
}
