package core.basesyntax;

public class RightTriangle extends Figure {
    private final int leg1;
    private final int leg2;

    public RightTriangle(Color color, int leg1, int leg2) {
        super.setColor(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
    }

    @Override
    public double getArea() {
        return (double) leg1 * leg2 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area : " + getArea()
                + "sq.units, leg1: " + leg1
                + " units, leg2: " + leg2 + " units, color: " + getColor());
    }
}
