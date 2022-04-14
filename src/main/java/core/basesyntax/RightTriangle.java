package core.basesyntax;

public class RightTriangle extends Figure {
    double leg1;
    double leg2;
    double hypotenuce;

    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.square = 0.5 * leg1 * leg2;
    }
    @Override
    public double getSquare() {
        square = 0.5 * leg1 * leg2;
        return square;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: right triangle\narea: " + square + " sq.units\nfirst leg: " + leg1 + " units\nsecond leg " + leg2 + " units\ncolor: " + color);
    }

}
