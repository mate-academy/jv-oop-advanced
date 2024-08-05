package core.basesyntax;

public class RightTriangle implements FigureMethods {
    private double leg1;
    private double leg2;

    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (leg1 * leg2) / 2;
    }

    @Override
    public void draw() {

    }
}
