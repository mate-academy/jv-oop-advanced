package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg;
    private double hypotenuse;

    public RightTriangle(Color color, double leg, double hypotenuse) {
        super(color);
        this.leg = leg;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void print() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
