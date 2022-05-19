package core.basesyntax;

public class RightTriangle extends FigureClass {
    private final double leg1;
    private final double leg2;

    public RightTriangle(Color color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.setInfo("Figure: right triangle, area: " + this.getArea() + " sq. units, leg1: "
                + (int) this.leg1 + " units, leg2: " + (int) this.leg2
                + " units, color: " + this.getColor().toString().toLowerCase());
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }
}
