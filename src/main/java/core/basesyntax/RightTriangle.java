package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;

    public RightTriangle(String color, double leg1, double leg2) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea()
                + " sq. units, leg 1: " + leg1
                + " units, leg 2: " + leg2 + " units, color: " + getColor());
    }
}
