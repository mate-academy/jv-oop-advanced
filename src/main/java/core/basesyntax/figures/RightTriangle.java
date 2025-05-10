package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double base;
    private double leg;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return base * leg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, "
                + "area: " + getArea() + " sq.units, base: " + getBase()
                + ", leg: " + getLeg() + ", color: " + getColor());
    }
}
