package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private final double leg1;
    private final double leg2;

    public RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (double) Math.round((leg1 * leg2) / 2 * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, leg1: " + leg1
                + " units, leg2: " + leg2
                + " units, color: " + color);
    }
}
