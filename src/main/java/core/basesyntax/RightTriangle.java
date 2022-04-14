package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        setSquare(0.5 * leg1 * leg2);
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: right triangle\narea: " + getSquare() + " sq.units\nfirst leg: "
                + leg1 + " units\nsecond leg " + leg2 + " units\ncolor: " + getColor());
    }

}
