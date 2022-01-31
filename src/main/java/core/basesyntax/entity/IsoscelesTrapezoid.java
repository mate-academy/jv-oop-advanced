package core.basesyntax.entity;

public class IsoscelesTrapezoid extends Figure{
    private double base;
    private double top;
    private double leg;

    public IsoscelesTrapezoid(double base, double top, double leg) {
        this.base = base;
        this.top = top;
        this.leg = leg;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        double baseLeg = (base - top) / 2;
        double height = Math.sqrt(leg * leg - baseLeg * baseLeg);
        double middleLine = (base + top) / 2;
        return middleLine * height;
    }
}
