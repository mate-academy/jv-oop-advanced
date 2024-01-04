package core.basesyntax;

public abstract class RightTriangle extends AbstractFigure {

    private final double leg1;

    private final double leg2;

    public RightTriangle(double leg1, double leg2, Color color) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return 0.5 * leg1 * leg2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing: straight tricuspid, squares: "
                + getArea() + " sq. ode, first leg: " + leg1 + " ode,"
                + " friend of a friend's leg: " + leg2 + " od., color: "
                + color);
    }
}
